package com.kbc.java17.practice.statics;
public class StaticTest2 {

    static{
        System.out.println("StaticTest2 static block");
    }

    static{
        System.out.println("StaticTest1 static block");
    }

    public static void main(String[] args) {
        System.out.println("Start: main() method");
        Super sup = new Sub();
        System.out.println("End: main() method");
        Super sup2 = new Sub();
    }
}