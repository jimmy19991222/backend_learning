package com.jieming.web;

import java.net.InetSocketAddress;

public class TestInetSocketAddress {
    public static void main(String[] args) {
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 8080);
        System.out.println(socketAddress);

        socketAddress = new InetSocketAddress("localhost", 8080);
        System.out.println(socketAddress);

        System.out.println(socketAddress.getAddress()); // address ip
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress.getPort()); // port
    }
}
