package org.goskyer.domain

import org.goskyer.conf.NoArgs

/**
 * Created by zohar on 2017/4/5.
 * desc: 用户详情
 */
@NoArgs
data class UserInfo(
        var userInfoId:Int,
        var userName:String?,
        var userAvatar:String?,
        var userGithub:String?,
        var userWechat:String?,
        var userQQ:String?,
        var userMd:String?,
        var userResume:String?,
        var userId:Int
)