package com.kbc.java17.practice.misc;

public class JVMTest1 {
    public static void main(String[] args) {

        System.out.println(String.class.getClassLoader());
        System.out.println(Super.class.getClassLoader());
    }
}