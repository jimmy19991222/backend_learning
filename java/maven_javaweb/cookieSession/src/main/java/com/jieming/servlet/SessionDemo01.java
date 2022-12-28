package com.jieming.servlet;
import com.jieming.proj.Person;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        //get Session
        HttpSession session = req.getSession();

        // save data
//        session.setAttribute("name", "jieming");
        session.setAttribute("name", new Person("jieming", 23));

        // get session id
        String id = session.getId();

        // return whether is new
        if(session.isNew()) {
            resp.getWriter().write("session is created, the ID is " + id);
        }else{
            resp.getWriter().write("the session exists, the ID is " + id);
        }

//        // What does session do when it is created?
//        Cookie cookie = new Cookie("JSESSIONID", id);
//        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
