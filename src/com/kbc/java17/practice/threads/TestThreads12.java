package com.kbc.java17.practice.threads;

import java.io.IOException;
import java.util.List;

public class TestThreads12 {

    public static void display(){
        try{
            Thread.sleep(10_000);
            System.out.println("Child Thread...");
        }
        catch(Exception exp){ }
    }
    public static void main(String... unused) throws IOException {
        Thread t = new Thread(() -> display());
        t.setDaemon(true);
        t.start();
        System.out.println("Main Thread...");
    }

}
