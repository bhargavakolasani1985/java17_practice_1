package com.kbc.java17.practice.iostreams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestIOStreams49 {
    public static void main(String... unused) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Path.of("C:\\Work\\java_practice\\source\\Employee_1.txt")));
        Address addr = new Address(101, "Newyork St", "Aurora");
        Person p = new Person(30, "KBC");
        p.setAddress(null);
        oos.writeObject(p);

        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Path.of("C:\\Work\\java_practice\\source\\Employee_1.txt")));
        Object obj = ois.readObject();
        System.out.println(obj);
    }
}