package com.kbc.java17.practice.format;

import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TestFormatClass4 {

    public static void main(String... unused) {
        String pattern = "#,###,000.0#";
        var message = DoubleStream.of(5.21, 18.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("˃ ˂"));
        System.out.println("˂"+message+"˃");
    }

}
