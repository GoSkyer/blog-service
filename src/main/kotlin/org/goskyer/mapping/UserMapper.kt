package org.goskyer.mapping

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import org.goskyer.domain.User
import org.springframework.stereotype.Repository

/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
@Repository
@Mapper
interface UserMapper {

    @Select("SELECT * FROM users WHERE user_id = #{userId}")
    @Throws(RuntimeException::class)
    abstract fun selectById(userId: Int): User

    @Insert("INSERT INTO users(user_email, password) VALUES (#{user.userEmail},#{user.password})")
    @Throws(RuntimeException::class)
    abstract fun insert(@Param("user") user: User):Int?

    @Select("SELECT * FROM users")
    @Throws(RuntimeException::class)
    abstract fun selectAll():List<User>

    @Select("SELECT user_id FROM users WHERE user_email = #{email}")
    abstract fun selectByEmail(email:String):Int

}