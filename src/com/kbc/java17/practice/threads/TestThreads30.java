package com.kbc.java17.practice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreads30 {
    private static int counter = 0;
    public static void main(String... unused) throws Exception {
        ExecutorService es = Executors.newSingleThreadExecutor();
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
        es.submit(r1);
        es.submit(r2);
        es.shutdown();
        System.out.println("isShutdown--->"+es.isShutdown());
        while(!es.isTerminated()){
            //System.out.println("Not yet Shutdown...");
        }
        System.out.println(es.isTerminated());
        System.out.println(es.isShutdown());
        System.out.println("End of Main Thread......");
    }

}
