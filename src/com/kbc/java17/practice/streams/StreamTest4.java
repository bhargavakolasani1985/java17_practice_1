package com.kbc.java17.practice.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1, 2, 3);
        DoubleStream ds = s1.mapToDouble(x -> x);
        Stream<Integer> s2 = ds.mapToInt(x -> x);
        s2.forEach(x -> System.out.println(x));
    }
}