package com.example.demoserveletfilter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class SimpleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Remote host:" + servletRequest.getRemoteHost());
        System.out.println("Remote address:" + servletRequest.getRemoteAddr());

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
