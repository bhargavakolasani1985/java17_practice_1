package com.kbc.java17.practice.generics;

class Cage<T> {
    private T t;
    Cage(){

    }
}

class Tiger{
    @Override
    public String toString() {
        return "Tiger";
    }
}
public class GenericsTest7 {
    public static void main(String[] args){
        prepare(new Tiger());
        ship(new Tiger());
    }
    public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }
    public static <T> Cage<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Cage<T>();
    }
}
