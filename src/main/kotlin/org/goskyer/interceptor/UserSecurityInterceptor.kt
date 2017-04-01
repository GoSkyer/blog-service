package org.goskyer.interceptor

import org.goskyer.domain.User
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import java.lang.Exception
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by zohar on 2017/3/31.
 * desc:
 */
@Component
class UserSecurityInterceptor :HandlerInterceptor{
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any?): Boolean {
        var any:Any? = request.getSession().getAttribute("cur_user");
        if (any == null || any is User) {
            response.sendRedirect(request.contextPath + "/login")
            return false
        } else{
            return true
        }
    }

    override fun postHandle(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?, modelAndView: ModelAndView?) {
    }

    override fun afterCompletion(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?, ex: Exception?) {
    }
}