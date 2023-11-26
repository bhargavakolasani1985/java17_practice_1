package com.kbc.java17.practice.streams;
import java.util.List;

public class StreamTest32 {
    public static void main(String[] args) {
        System.out.println(List.of("A","B","C","D").stream().reduce("", (a, b) -> a+b));
        System.out.println(List.of("A","B","C","D","E","F","G","H","I","J","A","B","C","D","E","F","G","H","I","J").parallelStream().reduce("", (a, b) -> a+b));
        System.out.println(List.of("A","B","C","D").stream().reduce("", (a, b) -> a+b, (x, y) -> x+y));
        System.out.println(List.of("A","B","C","D").stream().reduce("", (a, b) -> a+b, (x, y) -> y+x));
        System.out.println(List.of("A","B","C","D").stream().reduce("X", (a, b) -> a+b));
        System.out.println(List.of("A","B","C","D").parallelStream().reduce("", (a, b) -> a+b, (x, y) -> y+x));
        System.out.println(List.of("A","B","C","D").parallelStream().reduce("X", (a, b) -> a+b));
        System.out.println(List.of("A","B","C","D").parallelStream().reduce("X", (a, b) -> a+b, (x, y) -> x+y));
    }
}