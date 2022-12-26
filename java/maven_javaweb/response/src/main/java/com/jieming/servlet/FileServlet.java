package com.jieming.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String realPath = this.getServletContext().getRealPath("/dino.png");
        String realPath = "/Users/loujieming/小铭不熬夜/backend_learning/java/maven_javaweb/response/target/classes/dino.png";
        System.out.println("real path: "+realPath);

        String fileName = realPath.substring(realPath.lastIndexOf("/") + 1);
        System.out.println("fileName: "+fileName);

        resp.setHeader("Content-disposition","attachment;filename" + URLEncoder.encode(fileName, "UTF-8"));

        FileInputStream in = new FileInputStream(realPath);

        int len = 0;
        byte[] buffer = new byte[1024];
        ServletOutputStream out = resp.getOutputStream();
        while((len = in.read(buffer)) > 0){
            out.write(buffer, 0, len);
        }

        in.close();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
