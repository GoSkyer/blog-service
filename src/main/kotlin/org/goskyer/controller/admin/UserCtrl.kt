package org.goskyer.controller.admin

import jdk.nashorn.internal.runtime.regexp.joni.Config.log
import lombok.extern.slf4j.Slf4j
import org.goskyer.domain.User
import org.goskyer.service.inter.UserSer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
@Controller
@RestController
@RequestMapping("/admin")
@Slf4j
public class UserCtrl {

    @Autowired
    private lateinit var userSer: UserSer

    @PostMapping("/user")
    public fun register(@ModelAttribute("user") user: User): Int? {
        return userSer.register(user)
    }

    @GetMapping("/user")
    public fun select(@RequestParam("email") email: String): Int {
        val selectByEmail = userSer.selectByEmail(email)
        log.print("userId:      "+ selectByEmail)
        return selectByEmail
    }

    @GetMapping("/users")
    fun getUsers():List<User> {
        return userSer.getUsers()
    }

}