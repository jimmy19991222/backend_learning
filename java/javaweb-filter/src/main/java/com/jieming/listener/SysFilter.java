package com.jieming.listener;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req1 = (HttpServletRequest) req;
        HttpServletResponse resp1 = (HttpServletResponse) resp;

        if(req1.getSession().getAttribute("USER_SESSION")==null){
            resp1.sendRedirect("/sys/error.jsp");
        }

        filterChain.doFilter(req, resp);
    }

    public void destroy() {

    }
}
