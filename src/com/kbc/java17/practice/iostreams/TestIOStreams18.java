package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

public class TestIOStreams18 {
    public static void main(String... unused) throws IOException {
        var p1 = Path.of("/zoo/./bear","../food.txt");
        p1.normalize().relativize(Path.of("/lion"));
        System.out.println(p1);
    }

}
