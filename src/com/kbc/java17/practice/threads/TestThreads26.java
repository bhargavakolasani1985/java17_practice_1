package com.kbc.java17.practice.threads;

import java.io.IOException;

public class TestThreads26 {
    private static int counter = 0;
    public static void main(String... unused) throws IOException {
        Runnable r1 = () -> {
            for(int i=0;i<10;i++){
                counter++;
                System.out.print("Child Thread--->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        System.out.print("Counter--->"+counter);
        System.out.print("End of Main Thread......");
    }

}
