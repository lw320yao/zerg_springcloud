package com.java.base.file;

import java.util.Scanner;

public class ScannerTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            try{
                accept(scanner);
                break;
            }catch(Exception exc){
                scanner = new Scanner(System.in);
            }
        }
    }

    public static void accept(Scanner in){
        System.out.println("请输入整数");
        int nextInt = in.nextInt();
        System.out.println(nextInt);
    }

}
