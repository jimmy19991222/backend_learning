package com.jieming.web.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(6666);

        // receive
        while(true){
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            socket.receive(packet);

            // close connection
            byte[] data = packet.getData();
            String s = new String(data, 0, packet.getLength());

            System.out.println(s);
            if (s.equals("bye")){
                break;
            }
        }

        socket.close();
    }
}
