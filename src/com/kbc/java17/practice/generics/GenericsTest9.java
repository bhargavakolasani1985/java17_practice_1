package com.kbc.java17.practice.generics;

class Pen<T> {
    private T t;
    Pen(){

    }
}

class Loin{
    @Override
    public String toString() {
        return "Loin";
    }
}
public class GenericsTest9<T> {
    public static void main(String[] args){
        prepare(new Loin());
        ship(new Loin());
    }
    public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }
    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }

    public static <T> T ship(T t1, T t2) {
        System.out.println("Shipping " + t1 + t2);
        return new T();
    }
    
}
