package com.kbc.java17.practice.exceptions;

public class FileCloseable implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("FileCloseable::close");
        throw new Exception("Exception in FileCloseable");
    }
}
