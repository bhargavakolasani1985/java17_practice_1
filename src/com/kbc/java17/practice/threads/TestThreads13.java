package com.kbc.java17.practice.threads;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestThreads13 {

    public static void main(String... unused) throws IOException, ExecutionException, InterruptedException {
        var service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> {
            System.out.println("Open Zoo");
        }, 0, 1, TimeUnit.SECONDS);
        var result = service.submit(() ->
                System.out.println("Wake Staff"));
        System.out.println(result.get());
    }

}
