package com.hit.neuruimall.compent;

import com.hit.neuruimall.exception.NotLoggedException;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("adminUsername");
        request.setAttribute("msg", "请先登录");
        if (user == null) {
            throw new NotLoggedException();
        } else {
            return true;
        }
    }
}
