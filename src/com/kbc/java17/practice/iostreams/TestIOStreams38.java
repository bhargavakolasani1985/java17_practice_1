package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestIOStreams38 {
    public static void main(String... unused) throws IOException {
        System.out.println(Files.isSameFile(
                Path.of("C:\\Work\\java_practice\\source\\TestClass12.java"),
                Path.of("C:\\Work\\java_practice\\source\\TestClass11 .java"))
        );
        /*System.out.println(Files.isSameFile(
                Path.of("C:\\Work\\java_practice\\source\\TestClass1.java"),
                Path.of("C:\\Work\\java_practice\\source\\TestClass2.java"))
        );
        System.out.println(Files.mismatch(
                Path.of("C:\\Work\\java_practice\\source\\TestClass1.java"),
                Path.of("C:\\Work\\java_practice\\source\\TestClass1.java"))
        );
        System.out.println(Files.mismatch(
                Path.of("C:\\Work\\java_practice\\source\\TestClass1.java"),
                Path.of("C:\\Work\\java_practice\\source\\TestClass2.java"))
        );
        System.out.println(Files.mismatch(
                Path.of("C:\\Work\\java_practice\\source\\TestClass1.java"),
                Path.of("C:\\Work\\java_practice\\source\\TestClass3.java"))
        );*/
    }
}
