package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;

public class TestIOStreams26 {
    public static void main(String... unused) throws IOException {
        var p = Paths.get("C:\\tmp\\sloth.schedule");
        var a = Files.getFileAttributeView(p, BasicFileAttributeView.class);
        Files.createDirectory(p.resolve(".backup"));
        a.setTimes(null,null,null);
    }

}
