package com.kbc.java17.practice.streams;
import java.util.ArrayList;
import java.util.List;

public class StreamTest33 {
    public static void main(String[] args) {
        List<String> list = List.of("D", "A", "B", "C").stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(list);
        list = List.of("D", "A", "B", "C").parallelStream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(list);
    }
}