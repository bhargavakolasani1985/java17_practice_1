package com.kbc.java17.practice.generics;

public class ExceptionTest1 {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }
    public static void main(String[] args) {
        ExceptionTest1.printException(new NullPointerException ("A"));
        ExceptionTest1.printException(new Exception ("B"));
        ExceptionTest1.<Exception>printException(new Exception ("C"));
        ExceptionTest1.<NullPointerException>printException(new NullPointerException ("D"));
    }
}