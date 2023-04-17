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
public class GenericsTest11<T> {
    public static void main(String[] args){
        prepare(new Loin());
        ship(new Loin());
    }
    public  static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }
    public static Crate<T> <T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }

}
