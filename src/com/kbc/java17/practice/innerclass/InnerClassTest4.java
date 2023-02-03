package com.kbc.java17.practice.innerclass;

public class InnerClassTest4 {

    class Cub {}
    static class Den {}
    static void rest() {
        var c = new Cub();
    }
    void show() {
        var d = new Den();
        var c = new Cub();
    }
}
