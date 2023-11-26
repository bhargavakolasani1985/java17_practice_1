package com.kbc.java17.practice.threads;

import java.io.IOException;

public class TestThreads28 {
    private static int counter = 0;
    public static void main(String... unused) throws Exception {
        Thread mainThread = Thread.currentThread();
        Runnable r1 = () -> {
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                counter++;
                System.out.println("Child Thread--->"+i);
                if(counter == 10){
                    mainThread.interrupt();
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        while(counter < 10){
            System.out.println("Not completed yet......");
            try{
                Thread.sleep(2000);
            }catch(Exception exp){
                System.out.println("Thread Interrupted......");
            }

        }
        System.out.println("Counter--->"+counter);
        System.out.println("End of Main Thread......");
    }

}
