package com.kbc.java17.practice.threads;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] unused) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> result = service.submit(() ->
            {
                for (long i = 0; i < 1_000_000000; i++) counter++;
            });
            System.out.println(result.get(10, TimeUnit.SECONDS)); // Returns null for Runnable
            System.out.println("Reached!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            service.shutdown();
        }
    }
}