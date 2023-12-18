package com.kbc.java17.practice.iostreams;

import java.io.*;

public class TestIOStreams46 {
    public static void main(String... unused) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Work\\java_practice\\source\\Test_File_1.txt"));
        PrintStream ps = new PrintStream(new FileOutputStream("C:\\Work\\SSS\\java_practice\\target\\Test_File_1.txt"));
        int ch;
        while((ch = bis.read()) != -1){
            ps.print((char)ch);
        }
    }
}