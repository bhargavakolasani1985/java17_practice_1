package com.kbc.java17.practice.threads;

import java.util.concurrent.*;

public class TestThreads34 {
    public static void main(String... unused) throws Exception {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.schedule(() -> System.out.println("Runnable1..."), 5, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("Runnable2..."), 5, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("Runnable3..."), 5, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("Runnable4..."), 5, TimeUnit.SECONDS);
        ses.shutdown();
        System.out.println("End of Main Thread......");
    }
}
