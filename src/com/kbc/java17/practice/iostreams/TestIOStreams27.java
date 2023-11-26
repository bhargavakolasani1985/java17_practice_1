package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

public class TestIOStreams27 {
    public static void main(String... unused) throws IOException {
        Path path1 = Path.of("C:/Reading/Java/../Java17");
        Path path2 = Path.of("E:/Reading/AWS/../..");
        Path path3 = Path.of("E:/Reading/AWS/../../..");
        Path path4 = Path.of("../../..");
        Path path5 = Path.of("E:/Reading/./AWS");
        Path path6 = Path.of("Reading/AWS/../..");
        Path path7 = Path.of("./Reading.txt");
        var p8 = Path.of("./Reading/../Java17.txt");
        var p9 = Path.of("/Reading/../Java/Java17");
        var p10 = Path.of("../../Java17.txt");
        System.out.println(path1.normalize());
        System.out.println(path2.normalize());
        System.out.println(path3.normalize());
        System.out.println(path4.normalize());
        System.out.println(path5.normalize());
        System.out.println(path6.normalize());
        System.out.println(path7.normalize());
        System.out.println(p8.normalize());
        System.out.println(p9.normalize());
        System.out.println(p10.normalize());
    }

}
