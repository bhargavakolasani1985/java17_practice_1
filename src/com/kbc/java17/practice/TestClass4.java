package com.kbc.java17.practice;

public class TestClass4 {

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        if(a % 3 == 0){
           System.out.println("foo");
        }
        if(a % 5 == 0){
            System.out.println("bar");
        }
    }
}
