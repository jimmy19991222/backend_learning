package com.jieming.web.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        // create a service
        ServerSocket serverSocket = new ServerSocket(9000);
        // blocking listening
        Socket socket = serverSocket.accept();
        // get input stream
        InputStream is = socket.getInputStream();
        // file output
        FileOutputStream fos = new FileOutputStream(new File("receive.png"));

        System.out.println("Receiving picture...");
        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read()) != -1){
            fos.write(buffer, 0, len);
        }
        System.out.println("Done!");

        // tell client
        OutputStream os = socket.getOutputStream();
        os.write("Received, you can disconnect.".getBytes());

        // close resources
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
