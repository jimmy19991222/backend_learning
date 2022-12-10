package com.jieming.web.chat;

public class TalkFangfang {
    public static void main(String[] args) {
        new Thread(new TalkSend("localhost",7777, "localhost", 8888)).start();
        new Thread(new TalkReceive(9999, "Jieming")).start();
    }
}
