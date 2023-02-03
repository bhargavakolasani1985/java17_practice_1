package com.kbc.java17.practice.arrays;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class ArraysTest1 {
    public static void main(String[] args) {
        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        String[] s3 = { "Camel"};
        String[] s4 = { "Camel", null};
        System.out.println(Arrays.compare(s1, s2));
        System.out.println(Arrays.compare(s2, s1));
        System.out.println(Arrays.compare(s1, s3));
        System.out.println(Arrays.compare(s3, s1));
        System.out.println(Arrays.compare(s3, s4));
        System.out.println(Arrays.compare(s4, s3));
    }
}