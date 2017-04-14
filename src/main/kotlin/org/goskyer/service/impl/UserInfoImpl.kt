package org.goskyer.service.impl

import org.goskyer.domain.UserInfo
import org.goskyer.mapping.UserInfoMapper
import org.goskyer.service.UserInfoSer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by zohar on 2017/4/6.
 * desc:
 */
@Service
class UserInfoImpl : UserInfoSer {

    @Autowired
    private lateinit var userInfoMapper: UserInfoMapper

    override fun selectByUserId(userId: Int): UserInfo {
        return userInfoMapper.selectByUserId(userId)
    }

    override fun insert(userInfo: UserInfo): Int {
        return userInfoMapper.insertUserInfo(userInfo)
    }


}