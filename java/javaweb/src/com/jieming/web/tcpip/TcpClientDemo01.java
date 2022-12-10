package com.jieming.web.tcpip;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            int port = 9999;

            // socket connect
            socket = new Socket(serverIP, port);

            // IO stream to send msg
            os = socket.getOutputStream();

            // send msg
            os.write("hello, welcome!".getBytes());
            System.out.println("Client have sent a msg.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
