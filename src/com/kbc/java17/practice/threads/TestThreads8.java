package com.kbc.java17.practice.threads;

import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class TestThreads8 {
    public static void main(String[] args) {
        countIceCreamFlavors();
    }

    private static int counter;
    public static void countIceCreamFlavors()  {
        counter = 0;
        Runnable task = () -> counter++;
        LongStream.range(0, 500)
                .forEach(m -> new Thread(task).start());
        System.out.println(counter);
    }

}
