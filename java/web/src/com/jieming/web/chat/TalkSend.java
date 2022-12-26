package com.jieming.web.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSend implements Runnable{
    DatagramSocket socket = null;
    BufferedReader reader = null;

    private String fromIP;
    private int fromPort;
    private String toIP;
    private int toPort;

    public TalkSend(String fromIP, int fromPort, String toIP, int toPort){
        this.fromIP = fromIP;
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;

        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while(true){
            try {
                String data = reader.readLine();
                System.out.println("me: "+ data);
                byte[] dataByte = data.getBytes();
                DatagramPacket packet = new DatagramPacket(dataByte, 0, dataByte.length, new InetSocketAddress(this.toIP, this.toPort));

                socket.send(packet);
                if (data.equals("bye")){
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            socket.close();
        }
    }
}
