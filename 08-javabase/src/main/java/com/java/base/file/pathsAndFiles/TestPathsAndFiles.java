package com.java.base.file.pathsAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class TestPathsAndFiles {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home", "dd","test.txt");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.toUri());
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        // path.toFile();

        // Files.write(path, "sdf".getBytes());
        // Files.createDirectories(path);
//        Files.createFile(path);
//        Files.createDirectory(path);
        System.getProperty("user.home");


    }

}
