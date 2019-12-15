package com.java.base.file.pathsAndFiles;

import java.io.*;

public class ReadFileTest {

    public static void main(String[] args) throws IOException {

        String dPath = "C:\\intellj_workspace\\01-eureka\\home\\dali1\\dali2\\dd.txt";
        File dFile = new File(dPath);

        FileInputStream fileInputStream = new FileInputStream(dFile);
        int tempbyte;
        while((tempbyte=fileInputStream.read()) != -1){
            System.out.println(tempbyte);
        }
        int byteRead = 0;
        byte[] tempbytes = new byte[100];
        while((byteRead=fileInputStream.read(tempbytes)) != -1){
            System.out.write(tempbytes,0,byteRead);
        }
        fileInputStream.close();

        Reader reader = new InputStreamReader(new FileInputStream(dFile));
        int tempchar;
        while((tempchar = reader.read()) != -1){
            if(((char)tempchar) != '\r' ){
                System.out.print((char) tempchar);
            }
        }

        char[] tempchars = new char[20];
        int charread = 0;
        while((charread = reader.read()) != -1){

        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dFile));
        String tempString = null;
        int line = 1;
        while((tempString = bufferedReader.readLine()) != null){
            System.out.println("line:" + line + "tempString:" +tempString);
            line ++ ;
        }
    }
}
