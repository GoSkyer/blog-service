package org.goskyer.domain

import org.goskyer.conf.NoArgs

/**
 * Created by zohar on 2017/3/31.
 * desc: 用户
 */
@NoArgs
data class User(
        var userId: Int?,
        var userEmail: String?,
        var password: String?)