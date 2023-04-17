package com.kbc.java17.practice.lambda;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class LambdaTest5 {
    public static void main(String[] args) {
        /*Executors.newSingleThreadExecutor().execute((a) -> System.out::println);
        Consumer<String> cs = (a) -> System.out.println(a);*/
        for (int i = 0; i < 3; i++)
        System.out.print(i);
        Arrays.asList(0,1,2).forEach((a) -> System.out.println(a));
    }
}
