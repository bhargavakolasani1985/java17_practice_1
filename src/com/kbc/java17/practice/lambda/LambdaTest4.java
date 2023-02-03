package com.kbc.java17.practice.lambda;

interface AnimalFormat2{
    void print(String s1, String s2);
}
public class LambdaTest4 {
    public static void scary(AnimalFormat2 a) {
        a.print("Hello", "KBC");
    }
    public static void main(String[] args) {
        scary((var s1, var s2) -> {System.out.println(s1+s2);});
    }
}
