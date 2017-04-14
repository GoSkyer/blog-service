package org.goskyer.controller.auth

import lombok.extern.slf4j.Slf4j
import org.goskyer.domain.BaseResult
import org.goskyer.domain.User
import org.goskyer.service.UserSer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
@Controller
@RestController
@RequestMapping("/auth")
@Slf4j
public class UserCtrl : BaseController() {

    @Autowired
    private lateinit var userSer: UserSer

    @PostMapping("/register")
    public fun register(@ModelAttribute("user") user: User): BaseResult<*> {
        return BaseResult.build("注册成功", userSer.register(user))
    }

    @GetMapping("")
    public fun login(@RequestParam("email") email: String,@RequestParam("password") password:String): BaseResult<*>? {
        val token = userSer.login(email, password)
        return BaseResult.build("登陆成功",token)
    }



}