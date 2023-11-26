package com.kbc.java17.practice.streams;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StreamTest36 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new CopyOnWriteArrayList<>();
        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i=0; i<5; i++){
            es.submit(() -> list.add(10));
        }
        Thread.sleep(3000);
        System.out.println(list);
        es.shutdown();
    }
}