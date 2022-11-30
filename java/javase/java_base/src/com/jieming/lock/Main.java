package com.jieming.lock;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.concurrent.locks.ReentrantLock;

// extends version
class Worker1 extends Thread{
    private static final ReentrantLock lock = new ReentrantLock();
    public static Integer cnt = 0;

    private final static Object object = new Object();
    private boolean needWait = false;

    public Worker1(){}

    public Worker1(boolean needWait){
        this.needWait = needWait;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 100000; i++) {
//            lock.lock();
//            try {
//                cnt++;
//            }finally{
//                lock.unlock();
//            }
//        }

        synchronized (object){
            try {
                if (needWait) {
                    object.wait();
                    System.out.println(this.getName() + " is awake");
                }else{
                    object.notifyAll();
                    // Random notify a thread.
                    // object.notify();
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

            for (int i = 0; i < 100000; i++) {
                cnt = cnt + 1;
            }
        }
    }
}

// implement version
class Worker2 implements Runnable{
    public static Integer cnt = 0;

    private synchronized void work(){
        for (int i = 0; i < 100000; i++) {
            cnt ++;
        }
    }

    @Override
    public void run() {
        work();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        // extend version
//        Worker1 w1 = new Worker1();
//        Worker1 w2 = new Worker1();
//        w1.setName("thread-1");
//        w2.setName("thread-2");
//
//        w1.start();
//        w2.start();
//
//        w1.join();
//        w2.join();
//
//        System.out.println(Worker1.cnt);
//        System.out.println("Main thread finished!");

//        // interface version
//        Worker2 w = new Worker2();
//
//        Thread w1 = new Thread(w);
//        Thread w2 = new Thread(w);
//
//        w1.start();
//        w2.start();
//
//        w1.join();
//        w2.join();
//
//        System.out.println(Worker2.cnt);

        for (int i = 0; i < 5; i++) {
            Worker1 worker = new Worker1(true);
            worker.setName("thread-" + i);
            worker.start();
        }

        Worker1 worker = new Worker1(false);
        worker.setName("thread-5");

        Thread.sleep(1000);
        worker.start();
    }
}
