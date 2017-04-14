package org.goskyer.service

import org.goskyer.domain.User


/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
public interface UserSer {

    abstract fun register(user: User): Int?

    abstract fun getUsers():List<User>

    abstract fun selectByEmail(email: String): User?

    fun login(email: String,password: String):String
}