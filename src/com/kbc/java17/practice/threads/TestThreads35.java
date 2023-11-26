package com.kbc.java17.practice.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestThreads35 {
    public static void main(String... unused) throws Exception {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(() -> System.out.println("Runnable..."), 1, 1, TimeUnit.SECONDS);
        ses.shutdown();
        System.out.println("End of Main Thread......");
    }
}
