package com.kbc.java17.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest12 {
    public static void main(String[] args){
    }
    public static <T> void sink(T t) { }
    public static <T> T identity(T t) { return t; }
    public static T noGood(T t) { return t; }
}
