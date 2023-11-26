package com.kbc.java17.practice.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreads32 {
    public static void main(String... unused) throws Exception {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<?> fut = es.submit(() -> "test str");
        System.out.println(fut.get());
        System.out.println(es.submit(() -> System.out.println("Runnable Thread...")).get());
        es.shutdown();
        System.out.println("End of Main Thread......");
    }
}
