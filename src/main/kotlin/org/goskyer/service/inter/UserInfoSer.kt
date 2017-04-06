package org.goskyer.service.inter

import org.goskyer.domain.UserInfo

/**
 * Created by zohar on 2017/4/6.
 * desc:
 */
interface UserInfoSer {

    fun selectByUserId(userId:Int):UserInfo

    fun insert(userInfo: UserInfo):Int

}