package com.kbc.java17.practice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreads33 {
    public static void main(String... unused) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Runnable r1 = () -> {
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Child Thread--->"+i);
            }
        };
        Runnable r2 = () -> {
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Child Thread--->"+i);
            }
        };
        Runnable r3 = () -> {
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Child Thread--->"+i);
            }
        };
        es.execute(r1);
        es.submit(r2);
        es.submit(r3);
        es.shutdown();
        System.out.println("End of Main Thread......");
    }
}
