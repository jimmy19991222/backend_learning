package com.jieming.lock;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

// read_write conflict
class Worker extends Thread{
    public static int cnt = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            cnt++;
        }
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        w1.setName("thread-1");
        w2.setName("thread-2");

        w1.start();
        w2.start();

        w1.join();
        w2.join();

        System.out.println(Worker.cnt);
        System.out.println("Main thread finished!");
    }
}
