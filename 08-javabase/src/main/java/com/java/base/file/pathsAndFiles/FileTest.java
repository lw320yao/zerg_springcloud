package com.java.base.file.pathsAndFiles;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.FileSystemResource;

import java.io.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest {

    public static void main(String[] args) throws IOException {
        String path = "C:\\intellj_workspace\\01-eureka\\home\\dali1\\dali2";
        File myFile = new File(path);
        if(myFile.exists()){
            myFile.delete();
        }

        String content = "hello world";
        String fileName = "testdd.txt";
        File myFile2 = new File(path,fileName);
        if(!myFile2.exists()){
            myFile2.createNewFile();
        }


        String ddPath = "C:\\intellj_workspace\\01-eureka\\home\\dali1\\dali2\\ddd.txt";
        File ddFile = new File(ddPath);
        if(!ddFile.exists()){
            ddFile.createNewFile();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(ddFile);
        byte[] bytes = content.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();

        FileWriter fileWriter = new FileWriter(ddFile,true);
        fileWriter.write("fffff");
        fileWriter.flush();
        fileWriter.close();

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(ddFile,true));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(ddFile,true));
        bufferedWriter.write("bufferedwrite");
        bufferedWriter.flush();
        bufferedWriter.close();

        String dPath = "C:\\intellj_workspace\\01-eureka\\home\\dali1\\dali2\\dd.txt";
        File dFile = new File(dPath);
        PrintWriter printWriter = new PrintWriter(new FileWriter(dFile,true));
        printWriter.println("printwriter");
        printWriter.flush();
        printWriter.close();

    }
}
