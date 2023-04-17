package com.kbc.java17.practice.format;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestFormatClass7 {
    public static void main(String[] unused) {
        String puzzler = """
   One " \
   Two ""\n
   Three \"\"\"
""";
        System.out.print(puzzler);
        System.out.print("***********");
    }

}
