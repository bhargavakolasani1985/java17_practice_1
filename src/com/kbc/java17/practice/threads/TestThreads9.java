package com.kbc.java17.practice.threads;

import java.util.ArrayList;
import java.util.stream.LongStream;

public class TestThreads9 {
    private volatile int fuel;
    private void launch(int checks) {
        var p = new ArrayList<Thread>();
        for (int i = 0; i < checks; i++)
        p.add(new Thread(() -> fuel++));
        p.forEach(Thread::interrupt);
        p.forEach(Thread::start);
        p.forEach(Thread::interrupt);
    }
    public static void main(String[] args) throws Exception {
        var ship = new TestThreads9();
        ship.launch(100);
        Thread.sleep(6*1000);
        System.out.print(ship.fuel);
    }

}
