package com.kbc.java17.practice.format;

import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TestFormatClass2 {

    public static void main(String... unused) {
        String pattern = "##.#";
        var message = DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("˃ ˂"));
        System.out.println("˂"+message+"˃");
    }

}
