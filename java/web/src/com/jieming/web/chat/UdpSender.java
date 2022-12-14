package com.jieming.web.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);

        // data system.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String data = reader.readLine();
            byte[] dataB = data.getBytes();
            DatagramPacket packet = new DatagramPacket(dataB, 0, dataB.length, new InetSocketAddress("localhost", 6666));

            socket.send(packet);
            if (data.equals("bye")) {
                break;
            }
        }
        socket.close();
    }
}
