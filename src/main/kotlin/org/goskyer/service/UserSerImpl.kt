package org.goskyer.service

import org.goskyer.domain.User
import org.goskyer.mapping.UserMapper
import org.goskyer.service.inter.UserSer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
@Service
public class UserSerImpl : UserSer {

    @Autowired
    private lateinit var userMapper: UserMapper;

    override fun register(user: User): Int? {
        return userMapper.insert(user)
    }

    override fun getUsers(): List<User> {
        return userMapper.selectAll();
    }

    override fun selectByEmail(email: String): Int {
        return  userMapper.selectByEmail(email)
    }


}