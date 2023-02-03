package com.kbc.java17.practice.generics;

public class ExceptionTest2 {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }
    public static void main(String[] args) {
        ExceptionTest2.<Throwable>printException(new Exception ("C"));
    }
}