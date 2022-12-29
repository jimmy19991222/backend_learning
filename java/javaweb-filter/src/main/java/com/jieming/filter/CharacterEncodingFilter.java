package com.jieming.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter Initialing....");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("before CharacterEncodingFilter...");
        filterChain.doFilter(request, response);
        System.out.println("after CharacterEncodingFilter...");
    }

    public void destroy() {
        System.gc();
        System.out.println("CharacterEncodingFilter destroying...");
    }
}
