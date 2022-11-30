package com.jieming.multithread;

class Worker1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello! " + "thread-1 " + i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Worker2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello! " + "thread-2 " + i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
//        new Thread(new Worker1()).start();
//        new Thread(new Worker2()).start();

        Worker1 w = new Worker1();
        new Thread(w).start();
        new Thread(w).start();
    }
}
