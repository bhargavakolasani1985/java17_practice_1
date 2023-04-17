package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

public class TestIOStreams14 {
    public static void main(String... unused) throws IOException {
        var p1 = Path.of("/zoo/animals/./bear","../food.txt");
        System.out.println(p1.normalize().relativize(Path.of("/zoo/lion")));
        System.out.println(p1);
    }

}
