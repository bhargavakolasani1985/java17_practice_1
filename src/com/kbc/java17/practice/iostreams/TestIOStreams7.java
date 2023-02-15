package com.kbc.java17.practice.iostreams;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestIOStreams7 {
    public static void main(String... unused) throws IOException {
        StringReader reader = new StringReader("PEACOKS");
        var sb = new StringBuilder();
        sb.append((char)reader.read());
        for(int i=0; i<2; i++) {
            sb.append((char)reader.read());
            reader.skip(2);
        }
        reader.reset();
        reader.skip(0);
        sb.append((char)reader.read());
        System.out.println(sb.toString());

    }

}
