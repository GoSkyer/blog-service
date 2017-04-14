package org.goskyer.service.impl

import org.goskyer.domain.User
import org.goskyer.mapping.UserMapper
import org.goskyer.security.JwtTokenUtils
import org.goskyer.service.UserSer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
@Service
public class UserSerImpl : UserSer {

    private lateinit var userMapper: UserMapper;

    private lateinit var jwtTokenUtil: JwtTokenUtils

    private lateinit var authenticationManager: AuthenticationManager

    private lateinit var userDetailsService: UserDetailsService

    @Autowired
    constructor(userMapper: UserMapper, jwtTokenUtil: JwtTokenUtils, authenticationManager: AuthenticationManager, userDetailsService: UserDetailsService) {
        this.userMapper = userMapper
        this.jwtTokenUtil = jwtTokenUtil
        this.authenticationManager = authenticationManager
        this.userDetailsService = userDetailsService
    }


    override fun register(user: User): Int? {
        var userEmail = user.userEmail
        if (userMapper.selectByEmail(userEmail!!) !== null) {
            throw RuntimeException("该邮箱已被注册")
        }
        val bCryptPasswordEncoder = BCryptPasswordEncoder()
        user.password = bCryptPasswordEncoder.encode(user.password)
        user.role = "ROLE_USER"
        return userMapper.insert(user)
    }

    override fun getUsers(): List<User> {
        var a: List<String>

        return userMapper.selectAll();
    }

    override fun selectByEmail(email: String): User? {
        return userMapper.selectByEmail(email)
    }

    override fun login(email: String, password: String): String {
        var authenticationToken = UsernamePasswordAuthenticationToken(email, password)//根据用户名密码获取authenticationToken

        //根据authenticationToken获取authenticate 这个里面存储每个用户对应的信息,用户名密码不对获取不到会抛出异常
        var authenticate = authenticationManager.authenticate(authenticationToken)

        SecurityContextHolder.getContext().authentication = authenticate// 保存到SecurityContextHolder里

        // 生成登陆用的token
        val userDetail = userDetailsService.loadUserByUsername(email)
        val token = jwtTokenUtil.generateToken(userDetailsService.loadUserByUsername(email))
        return token
    }
}