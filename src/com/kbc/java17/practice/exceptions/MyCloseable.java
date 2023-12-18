package com.kbc.java17.practice.exceptions;

public class MyCloseable implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("MyCloseable::close");
    }
}
