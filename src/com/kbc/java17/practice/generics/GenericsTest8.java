package com.kbc.java17.practice.generics;

class Crate<T> {
    private T t;
    Crate(){

    }
}

class Horse{
    @Override
    public String toString() {
        return "Horse";
    }
}
public class GenericsTest8<T> {
    public static void main(String[] args){
        prepare(new Horse());
        ship(new Horse());
    }
    public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }
    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }

}
