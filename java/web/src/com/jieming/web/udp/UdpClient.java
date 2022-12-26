package com.jieming.web.udp;

import java.io.IOException;
import java.net.*;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        // socket
        DatagramSocket socket = new DatagramSocket();

        // destination
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;

        // package
        String msg = "Hello, server!";
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);

        // send
        socket.send(packet);

        // close
        socket.close();
    }
}
