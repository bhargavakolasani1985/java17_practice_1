package com.kbc.java17.practice.format;

import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TestFormatClass11 {

    public static void main(String... unused) {
        String pattern = "'#'#,###0,000.0#";
        var message = DoubleStream.of(00005.21, 018.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("˃ ˂"));
        System.out.println("˂"+message+"˃");
    }

}
