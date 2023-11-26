package com.kbc.java17.practice.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestThreads37 {
    public static void main(String... unused) throws Exception {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(10);
        Runnable r1 = () -> {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child Thread...");
        };
        ses.scheduleWithFixedDelay(r1, 2, 2, TimeUnit.SECONDS);
        //ses.shutdown();
        System.out.println("End of Main Thread......");
    }
}
