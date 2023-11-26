package com.kbc.java17.practice.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class StreamTest34 {
    public static void main(String[] args) {
        Set<String> list = List.of("D", "A", "B", "C").stream().collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(list);
        list = List.of("D", "A", "B", "C").parallelStream().collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
        System.out.println(list);
    }
}