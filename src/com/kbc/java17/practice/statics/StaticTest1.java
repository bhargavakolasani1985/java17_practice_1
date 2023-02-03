package com.kbc.java17.practice.statics;
public class StaticTest1 {

    static{
        System.out.println("StaticTest1 static block");
    }

    public static void main(String[] args) {
        System.out.println("main() method");
        Super sup = new Sub();
        Super sup2 = new Sub();
    }
}