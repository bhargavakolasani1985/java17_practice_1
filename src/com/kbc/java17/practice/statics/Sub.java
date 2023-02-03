package com.kbc.java17.practice.statics;

public class Sub extends Super {

    static{
        System.out.println("Sub static block");
    }

    {
        System.out.println("Sub instance block");
    }
    public void show(){}
}
