package com.jieming.web;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) {
        try {
            // localhost
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);
            inetAddress1 = InetAddress.getByName("localhost");
            System.out.println(inetAddress1);
            inetAddress1 = InetAddress.getLocalHost();
            System.out.println(inetAddress1);

            // search website's ip address
            InetAddress inetAddress2 = InetAddress.getByName("www.google.com");
            System.out.println(inetAddress2);

            // useful methods
//            System.out.println(inetAddress2.getAddress());
//            System.out.println(inetAddress2.getCanonicalHostName()); // canonical name
            System.out.println(inetAddress2.getHostAddress()); // ip
            System.out.println(inetAddress2.getHostName()); // domain name

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
