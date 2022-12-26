package com.jieming.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // refresh every 3 seconds
        resp.setHeader("refresh", "3");

        // new an image in RAM
        BufferedImage image = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);

        // get the image
        Graphics2D graphics = (Graphics2D) image.getGraphics(); // pen
        // set bg color
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 80, 20);
        // write number
        graphics.setColor(Color.blue);
        graphics.setFont(new Font(null, 2, 20));

        graphics.drawString(makeNum(), 0, 20);

        // tell browser to open the request with picture
        resp.setContentType("image/jpeg");

        // without buffer
        resp.setDateHeader("expires", -1);
        resp.setHeader("Cache_Control", "no-cache");
        resp.setHeader("Program", "no-cache");

        // write in browser
        ImageIO.write(image, "jpg", resp.getOutputStream());
    }

    private String makeNum(){
        Random random = new Random();
        String num = random.nextInt(9999999) + "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<7-num.length(); i++){
            sb.append("0");
        }
        num = sb.toString() + num;
        return num;
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
