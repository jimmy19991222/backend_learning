package com.jieming.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineCountListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext ctx = httpSessionEvent.getSession().getServletContext();
        Integer onlineCount = (Integer)ctx.getAttribute("OnlineCount");
        if (onlineCount == null){
            onlineCount = new Integer(1);
//            ctx.setAttribute("OnlineCount", 1);
        } else {
            onlineCount = new Integer(onlineCount.intValue()+1);
//            ctx.setAttribute("OnlineCount", onlineCount.intValue() + 1);
        }
        ctx.setAttribute("OnlineCount", onlineCount);
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext ctx = httpSessionEvent.getSession().getServletContext();
        Integer onlineCount = (Integer)ctx.getAttribute("OnlineCount");
        if (onlineCount == null){
            onlineCount = new Integer(0);
//            ctx.setAttribute("OnlineCount", 0);
        } else {
            onlineCount = new Integer(onlineCount.intValue()-1);
//            ctx.setAttribute("OnlineCount", onlineCount.intValue() - 1);
        }
        ctx.setAttribute("OnlineCount", onlineCount);
    }
}
