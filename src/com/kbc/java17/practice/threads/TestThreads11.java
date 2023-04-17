package com.kbc.java17.practice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreads11 {
    public static void main(String[] args) throws Exception{
        var service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> {
            System.out.println("Open Zoo");
        }, 0, 1);
        var result = service.submit(() ->
                System.out.println("Wake Staff"));
        System.out.println(result.get());
    }

}
