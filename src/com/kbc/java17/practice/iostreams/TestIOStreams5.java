package com.kbc.java17.practice.iostreams;

import java.io.IOException;
import java.nio.file.Path;

public class TestIOStreams5 {

    static void displayPaths(Path path){
        System.out.println("NameCount-"+path.getNameCount());
        for(int i=0; i<path.getNameCount(); i++){
            System.out.println("PathName-"+path.getName(i));
        }
    }

    public static void main(String... unused) throws IOException {
        Path path1 = Path.of("C:\\Reading\\Java\\Java17");
        Path path2 = Path.of("Java17");
        Path path3 = Path.of("./Java17");
        Path path4 = Path.of("/Reading/Java/Java17");
        displayPaths(path1);
        System.out.println("");
        displayPaths(path2);
        System.out.println("");
        displayPaths(path3);
        System.out.println("");
        displayPaths(path4);
    }

}
