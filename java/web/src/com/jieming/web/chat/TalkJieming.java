package com.jieming.web.chat;

public class TalkJieming {
    public static void main(String[] args) {
        new Thread(new TalkSend("localhost",6666, "localhost", 9999)).start();
        new Thread(new TalkReceive(8888, "Fangfang")).start();
    }
}
