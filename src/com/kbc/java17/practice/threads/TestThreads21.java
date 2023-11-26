package com.kbc.java17.practice.threads;

import java.io.IOException;

public class TestThreads21 {
    public static void main(String... unused) throws IOException {
        Runnable r1 = () -> System.out.print("Child Thread......");
        new Thread(r1).start();
        System.out.print("Main Thread......");
    }

}
