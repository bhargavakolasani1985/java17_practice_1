package com.kbc.java17.practice.streams;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest30 {
    public static void main(String[] args) {
        List<Integer> list = (List.of(1, 2, 3));
        System.out.println(list.stream().reduce(0, (a, b) -> a-b));
    }
}