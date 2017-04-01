package org.goskyer.service.inter

import org.goskyer.domain.User


/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
public interface UserSer {

    abstract fun register(user: User): Int?

    abstract fun getUsers():List<User>

    abstract fun selectByEmail(email: String): Int
}