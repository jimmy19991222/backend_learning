package com.jieming.web.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);

        OutputStream os = socket.getOutputStream();

        // read file
        FileInputStream fis = new FileInputStream(new File("test.png"));

        // write file
        byte[] buffer = new byte[1024];
        int len;
        System.out.println("Sending picture....");
        while((len = fis.read(buffer))!=-1){
            os.write(buffer, 0, len);
        }
        System.out.println("Done!");

        // tell the server, the sending is done!
        socket.shutdownOutput();

        // should receive from server. then close the connection
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer2 = new byte[1024];
        int len2;
        while((len = is.read(buffer2))!=-1) {
            baos.write(buffer2, 0, len);
        }
        System.out.println(baos.toString());

        // close
        baos.close();
        is.close();
        fis.close();
        os.close();
        socket.close();
    }
}
