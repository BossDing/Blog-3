package com.beautifulsoup.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by BeautifulSoup on 2017/12/1.
 */
@Component
public class BlogUserQueryInterceptor implements HandlerInterceptor {
    private Logger logger= LoggerFactory.getLogger(getClass());
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String requestUri=httpServletRequest.getRequestURI();

        String authType=httpServletRequest.getAuthType();

        httpServletRequest.authenticate(httpServletResponse);

        String contextPath=httpServletRequest.getContextPath();
        Cookie[] cookies=httpServletRequest.getCookies();
        String servletPath =httpServletRequest.getServletPath();

        logger.info("RequestUri的值是:"+requestUri);
        logger.info("AuthType的值是:"+authType);
        logger.info("ContextPath的值是:"+contextPath);
        logger.info("ServletPath的值是:"+servletPath);
        if(requestUri.equals("/user/getbyname")){
            httpServletResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
            httpServletResponse.setContentType("application/json;charset=UTF-8");
            httpServletResponse.getWriter().write("未授权不能访问!");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
