package com.kbc.java17.practice.lambda;

interface AnimalFormat{
    void print(String s1, String s2);
}
public class LambdaTest3 {
    public static void scary(AnimalFormat a) {
        a.print("Hello", "KBC");
    }
    public static void main(String[] args) {
        scary((var s1, var s2) -> {System.out.println(s1+s2);});
    }
}
