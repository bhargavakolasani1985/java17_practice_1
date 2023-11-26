package com.kbc.java17.practice.iostreams;

import java.io.*;

public class TestIOStreams44 {
    public static void main(String... unused) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Work\\java_practice\\source\\Test_File_1.txt"));
        PrintStream ps = new PrintStream(new FileOutputStream("C:\\Work\\java_practice\\target\\Test_File_1.txt"));
        int bytesToRead = 1024;
        byte[] buff = new byte[bytesToRead];
        int bytesRead;
        while((bytesRead = bis.read(buff, 0 , bytesToRead)) > 0){
            ps.print(buff);
        }

    }
}