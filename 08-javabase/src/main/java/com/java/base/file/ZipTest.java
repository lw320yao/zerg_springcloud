package com.java.base.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipTest {

    public static void main(String[] args) throws IOException{
        createZipFile();
        String zipName = "zipTest.zip";
        showContents1(zipName);
        System.out.println("________");
        // showContents2(zipName);

    }

    public static void showContents1(String zipName) throws IOException {
        try(ZipInputStream zin = new ZipInputStream(new FileInputStream(zipName))){
            ZipEntry zipEntry;
            while( (zipEntry = zin.getNextEntry()) != null) {
                System.out.println(zipEntry.getName());
                Scanner scanner = new Scanner(zin);
                while(scanner.hasNext()){
                    System.out.println("  " + scanner.nextLine());
                }
                zin.closeEntry();
            }
        }
    }

    public static void showContents2(String zipName) throws IOException{
        FileSystem fileSystem = FileSystems.newFileSystem(Paths.get(zipName),null);
        Files.walkFileTree(fileSystem.getPath("/"),new SimpleFileVisitor<Path>(){
            @Override
            public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
                System.out.println(path);
                for(String line:Files.readAllLines(path, Charset.forName("UTF-8"))){
                    System.out.println("  " + line);
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }

    public static void createZipFile() throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("zipTest.zip");
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
        int i = 0;
        while(true){
            ZipEntry zipEntry = new ZipEntry("one"+i+".txt");
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            i ++ ;
            if (i==4) {
                break;
            }
        }
    }

}
