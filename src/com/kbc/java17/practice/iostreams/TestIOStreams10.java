package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class TestIOStreams10 {
    public static void main(String... unused) throws IOException {
        var p = Paths.get("C:\\tmp\\sloth.schedule");
        var a = Files.readAttributes(p, BasicFileAttributes.class);
        Files.createDirectory(p.resolve(".backup"));
    }

}
