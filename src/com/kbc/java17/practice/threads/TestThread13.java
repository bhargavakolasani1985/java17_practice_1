package com.kbc.java17.practice.threads;

import java.io.IOException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread13 {
    public static void main(String... unused) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        CyclicBarrier cb1 = new CyclicBarrier(4);
        CyclicBarrier cb2 = new CyclicBarrier(4);
        for(int i=1; i<=6; i++){
            service.submit(() -> perform(cb1, cb2));
        }
        service.shutdown();
    }

    public static void perform(CyclicBarrier cb1, CyclicBarrier cb2){
        removeLion();
        try {
            cb1.await();
            cleanDen();
            cb2.await();
            addLion();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }

    public static void removeLion(){
        System.out.println("Removed Lion");
    }
    public static void cleanDen(){
        System.out.println("Cleaned Den");
    }
    public static void addLion(){
        System.out.println("Added Loin");
    }

}
