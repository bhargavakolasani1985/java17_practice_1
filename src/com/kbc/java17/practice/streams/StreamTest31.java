package com.kbc.java17.practice.streams;
import java.util.List;

public class StreamTest31 {
    public static void main(String[] args) {
        List<Integer> list = (List.of(1, 2, 3));
        System.out.println(list.stream().reduce(0, (a, b) -> a+b));
        System.out.println(list.stream().parallel().reduce(0, (a, b) -> a-b));
    }
}