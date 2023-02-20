package com.kbc.java17.practice.threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.util.List;

public class TestThreads1 {
    public static void main(String... unused) throws IOException {
        System.out.print(List.of("duck","flamingo","pelican", "kbc")
                        .parallelStream().parallel()   // q1
                        .reduce(0,
                                (c1, c2) -> c1.length() + c2.length(),  // q2
                (s1, s2) -> s1 + s2));      // q3

    }

}
