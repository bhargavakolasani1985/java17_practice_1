package com.kbc.java17.practice.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreads31 {
    private static int counter = 0;
    public static void main(String... unused) throws Exception {
        Callable c1 = () -> "test string";
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> str = es.submit(c1);
        System.out.println("End of Main Thread......");
    }

}
