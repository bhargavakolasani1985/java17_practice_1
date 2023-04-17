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
public class GenericsTest10<T> {
    public static void main(String[] args){
        prepare(new Loin());
        ship(new Loin());
    }
    public  <T> static void prepare(T t) {
        System.out.println("Preparing " + t);
    }
    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }

}
