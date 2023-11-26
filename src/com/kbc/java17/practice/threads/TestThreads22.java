package com.kbc.java17.practice.threads;

import java.io.IOException;

public class TestThreads22 {
    public static void main(String... unused) throws IOException {
        Runnable r1 = () -> System.out.print("Child Thread1......");
        Runnable r2 = () -> System.out.print("Child Thread2......");
        Runnable r3 = () -> System.out.print("Child Thread3......");
        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        System.out.print("Main Thread......");
    }

}
