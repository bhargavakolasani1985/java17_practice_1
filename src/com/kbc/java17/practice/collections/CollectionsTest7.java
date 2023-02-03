package com.kbc.java17.practice.collections;

import java.util.*;

public class CollectionsTest7 {
    public static void main(String[] args){
        List<Integer> one = List.of(8, 16, 2);
        var copy = List.copyOf(one);
        var copyOfCopy = List.copyOf(copy);
        var thirdCopy = new ArrayList<>(copyOfCopy);
        thirdCopy.replaceAll(x -> x * 2);
        System.out.println(thirdCopy);
        System.out.println(copyOfCopy);
        var fourthCopy = new ArrayList<>(thirdCopy);
        fourthCopy.replaceAll(x -> x * 2);
        System.out.println(fourthCopy);
        System.out.println(thirdCopy);
    }
}
