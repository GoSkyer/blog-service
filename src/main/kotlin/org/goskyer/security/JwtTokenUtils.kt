package org.goskyer.security

import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.beans.factory.annotation.Value
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Component
import java.util.*

/**
 * Created by zohar on 2017/4/13.
 * desc: token工具类
 */
@Component
class JwtTokenUtils {
    /**
     * 用户名
     */
    private val CLAIM_KEY_USERNAME = "sub"
    /**
     * 创建日期
     */
    private val CLAIM_KEY_CREATED = "created"
    /**
     * 密钥
     */
    @Value("\${jwt.secret}")
    private lateinit var secret: String
    /**
     * 过期时间
     */
    @Value("\${jwt.expiration}")
    private var expiration: Long? = null

    /**
     * 生成token
     */
    fun generateToken(userDetails: UserDetails): String {
        var claims = HashMap<String, Any>()
        claims.put(CLAIM_KEY_USERNAME, userDetails.username)
        claims.put(CLAIM_KEY_CREATED, Date())
        val compact = Jwts.builder()
                .setClaims(claims) //设置令牌
                .setExpiration(generateExpirationDate()) //设置过期时间
                .signWith(SignatureAlgorithm.HS512, secret)//签名方式
                .compact()
        return compact
    }

    /**
     * 生成过期时间
     */
    private fun generateExpirationDate(): Date = Date(System.currentTimeMillis() + expiration!! * 1000)

    /**
     * 验证token是否有效
     */
    public fun validateToken(token: String): Boolean {
        val expiration = getExpirationDateFromToken(token)
        return expiration!!.before(Date())
    }

    /**
     * 获取token创建日期
     */
    fun getExpirationDateFromToken(token: String): Date? {
        var expiration: Date?
        try {
            val claims = getClaimsFromToken(token)
            expiration = claims!!.getExpiration()
        } catch (e: Exception) {
            expiration = null
        }

        return expiration
    }

    /**
     * 从token获得令牌
     */
    private fun getClaimsFromToken(token: String): Claims? {
        var claims: Claims?
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .body
        } catch (e: Exception) {
            claims = null
        }

        return claims
    }

    /**
     * 从token获取UserEmail
     */
    public fun getUserNameByToken(token: String): String? {
        var claims = getClaimsFromToken(token)
        return claims!!.subject


    }
}