package com.example.main;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class MainHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest requestServlet, HttpServletResponse responseServlet, Object handler) throws Exception
    {
        /*if (requestServlet.getRequestURL().toString().contains("time")){
            return false;
        }
       System.out.println("MINIMAL: INTERCEPTOR PREHANDLE CALLED");*/
       return true;
    }
}
