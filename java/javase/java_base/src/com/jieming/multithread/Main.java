package com.jieming.multithread;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

class Worker extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello! " + i + " " + this.getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
//                throw new RuntimeException(e);
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        w1.setName("thread-1");
        w2.setName("thread-2");

        // daemon thread
        w1.setDaemon(true);
        w2.setDaemon(true);

        w1.start();
        w2.start();

//        // main thread will wait until these two threads finish.
//        // parameter is maximum wait time.
//        w1.join(5000);
//        w1.interrupt();

        Thread.sleep(5000);
        System.out.println("Main thread finished!");
    }
}
