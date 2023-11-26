package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TestIOStreams1 {
    public static void main(String... unused) throws IOException {
        Path path = Path.of("C:\\Reading\\Java\\Java17");
        System.out.println(path);
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.toAbsolutePath());
        System.out.println(Files.exists(path));
        if(Files.isDirectory(path)){
            System.out.println(Files.size(path));
            System.out.println(path.getNameCount());
            Stream<Path> stream = Files.list(path);
            stream.forEach(System.out::println);
        }
    }

}
