package com.jieming.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("LastLoginTime", System.currentTimeMillis()+"");
        cookie.setMaxAge(0); // immediately del cookie
        resp.setContentType("text/html;charset=utf-8");
        resp.addCookie(cookie);
    }
}
