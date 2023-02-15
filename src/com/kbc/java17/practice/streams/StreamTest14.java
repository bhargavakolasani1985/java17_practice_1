package com.kbc.java17.practice.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest14 {
    public static void main(String[] args) {
        int[] intArr = {1, 10, 9, 7, 8, 6, 7, 4, 13, 4, 9};
        Set<Integer> set = Arrays.stream(intArr).boxed().filter(x -> x%2 != 0).collect(Collectors.toSet());
        System.out.println(set);
    }
}