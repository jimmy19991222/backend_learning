package com.jieming.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PrintWriter out = resp.getWriter();

        Cookie[] cookies = req.getCookies();
        if (cookies!=null){
            for (Cookie cookie: cookies){
                if (cookie.getName().equals("LastLoginTime")){
                    long lastLoginTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLoginTime);
                    out.write(date.toLocaleString());
                }
            }
        } else{
            out.write("first time visit");
        }

        Cookie cookie = new Cookie("LastLoginTime", System.currentTimeMillis()+"");
        cookie.setMaxAge(24*60*60); // expire time: 1 day
        resp.setContentType("text/html;charset=utf-8");
        resp.addCookie(cookie);
    }
}
