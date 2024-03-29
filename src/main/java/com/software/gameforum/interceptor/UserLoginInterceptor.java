package com.software.gameforum.interceptor;

import com.software.gameforum.entity.User;
import com.software.gameforum.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UserLoginInterceptor implements HandlerInterceptor {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UserLoginInterceptor.class);
    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession httpSession = request.getSession(false);
        if (httpSession == null) {
            LOGGER.debug("没有设置session  " + request.getContextPath());
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }
        if (httpSession.getAttribute("user") == null || !(httpSession.getAttribute("user") instanceof User)) {
            LOGGER.debug("session无效  " + request.getContextPath());
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }
        if (userService.getUserById(((User) httpSession.getAttribute("user")).getId()) == null) {
            LOGGER.debug("无该用户" + request.getContextPath());
            response.sendRedirect(request.getContextPath() + "/login");
            return false;
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
