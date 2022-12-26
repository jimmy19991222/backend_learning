package com.jieming.web.tcpip;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo01 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            serverSocket = new ServerSocket(9999);
            // wait for clients' connection
            socket = serverSocket.accept();

            // read clients' msg
            is = socket.getInputStream();

            // pipeline stream
            baos = new ByteArrayOutputStream();

            // receive msg with buffer into baos
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!= -1){
                baos.write(buffer, 0, len);
            }
            System.out.println("Server received a msg.");
            System.out.println(baos.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // close connection
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
