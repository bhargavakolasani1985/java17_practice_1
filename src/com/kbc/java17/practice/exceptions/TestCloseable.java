package com.kbc.java17.practice.exceptions;

public class TestCloseable implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("TestCloseable::close");
        throw new Exception("Exception in TestCloseable");
    }
}
