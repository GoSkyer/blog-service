package org.goskyer.mapping

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import org.goskyer.domain.UserInfo
import org.springframework.stereotype.Repository

/**
 * Created by zohar on 2017/4/6.
 * desc: 用户详情mapper
 */
@Mapper
@Repository
interface UserInfoMapper {

    @Select("SELECT * FROM user_info WHERE user_id = #{userId}")
    fun selectByUserId(@Param("userId") userId: Int): UserInfo

    @Insert("INSERT user_info(user_id, user_name, user_avatar, user_github, user_wechat, user_qq, user_md, user_resume)" +
            " VALUES (#{userInfo.userId},#{userInfo.userName},#{userInfo.userAvatar},#{userInfo.userGithub},#{userInfo.userWechat}," +
            "#{userInfo.userQQ},#{userInfo.userMd},#{userInfo.userResume})")
    fun insertUserInfo(@Param("userInfo") userInfo: UserInfo): Int

}