package org.goskyer.controller

import org.goskyer.domain.UserInfo
import org.goskyer.service.impl.UserInfoImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by zohar on 2017/4/6.
 * desc:
 */
@RestController
@RequestMapping("/user/info")
class UserInfoCtrl {

    @Autowired
    private lateinit var userInfoImpl: UserInfoImpl

    @GetMapping("/{userId}")
    fun selectByUserId(@PathVariable("userId") userId:Int): UserInfo {
        return userInfoImpl.selectByUserId(userId)
    }

    @PostMapping("/")
    fun insertUserInfo(@ModelAttribute("userInfo") userInfo: UserInfo):Int{
        return userInfoImpl.insert(userInfo)
    }

}