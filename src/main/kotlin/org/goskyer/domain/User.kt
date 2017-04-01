package org.goskyer.domain

import org.goskyer.conf.NoArgs

/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
@NoArgs
data class User(
        var userId: Int?,
        var userEmail: String?,
        var password: String?)