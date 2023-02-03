package com.kbc.java17.practice.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1, 2, 3);
        DoubleStream ds = s1.mapToDouble(x -> x);
        IntStream is = ds.mapToInt(x -> (int)x);
        is.forEach(x -> System.out.println(x));
    }
}