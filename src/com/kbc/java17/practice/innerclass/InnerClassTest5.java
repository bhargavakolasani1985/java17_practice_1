package com.kbc.java17.practice.innerclass;

public class InnerClassTest5 {

    class Cub {}
    static class Den {}
    static void rest() {
        var d1 = new Den();
        var d2 = new InnerClassTest5.Den();
    }
    void show() {
        var d = new Den();
    }
}
