package com.kbc.java17.practice.threads;

import java.io.IOException;
import java.util.List;

public class TestThreads20 {
    public static void main(String... unused) throws IOException {
        new Thread(() -> {System.out.print("Child Thread......");}).start();
        System.out.print("Main Thread......");
    }

}
