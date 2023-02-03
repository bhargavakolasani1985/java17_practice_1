package com.kbc.java17.practice.arrays;

import java.util.Arrays;

public class ArraysTest2 {
    public static void main(String[] args) {
        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Peacock", "Peacock"};
        String[] s3 = { "Camel"};
        String[] s4 = { "Camel", null};
        String[] s5 = { "Peacock"};
        System.out.println(Arrays.mismatch(s1, s2));
        System.out.println(Arrays.mismatch(s2, s1));
        System.out.println(Arrays.mismatch(s1, s3));
        System.out.println(Arrays.mismatch(s3, s1));
        System.out.println(Arrays.mismatch(s3, s4));
        System.out.println(Arrays.mismatch(s4, s3));
        System.out.println(Arrays.mismatch(s3, s5));
    }
}