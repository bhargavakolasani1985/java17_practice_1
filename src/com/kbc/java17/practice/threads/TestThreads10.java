package com.kbc.java17.practice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreads10 {
    private volatile int sheepCount = 0;

    private void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            TestThreads10 manager = new TestThreads10();
            for (int i = 0; i < 10; i++)
                service.submit(() ->
                        manager.incrementAndReport()
                );
        } finally {
            service.shutdown();
        }
    }

}
