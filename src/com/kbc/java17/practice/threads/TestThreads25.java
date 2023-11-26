package com.kbc.java17.practice.threads;

import java.io.IOException;

public class TestThreads25 {
    public static void main(String... unused) throws IOException {
        Runnable r1 = () -> {
            for(int i=0;i<10;i++){
                System.out.print("Child Thread--->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.setDaemon(true);
        t1.start();
        System.out.print("Main Thread......");
    }

}
