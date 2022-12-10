package com.jieming.web.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable{
    DatagramSocket socket = null;
    private int port;
    private String msgFrom;

    public TalkReceive(int port, String msgFrom) {
        this.port = port;
        this.msgFrom = msgFrom;
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while(true){
            try {
                byte[] container = new byte[1024];
                DatagramPacket packet = new DatagramPacket(container, 0, container.length);
                socket.receive(packet);
                byte[] data = packet.getData();
                String dataString = new String(data, 0, packet.getLength());

                System.out.println(msgFrom + ": " + dataString);

                if (dataString.equals("bye")){
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        socket.close();
    }
}
