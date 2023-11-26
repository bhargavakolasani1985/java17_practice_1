package com.kbc.java17.practice.threads;

import java.io.IOException;

public class TestThreads24 {
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
        new Thread(r1).start();
        System.out.print("Main Thread......");
    }

}
