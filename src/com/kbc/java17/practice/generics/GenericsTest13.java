package com.kbc.java17.practice.generics;

public class GenericsTest13<T> {
    public static void main(String[] args){
        GenericsTest13<Cage> obj = new GenericsTest13<>();
        String str = obj.tricky("this is test");
        System.out.println(str);
    }
    public <T> T tricky(T t) {
        return t;
    }
}
