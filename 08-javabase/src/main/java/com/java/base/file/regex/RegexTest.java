package com.java.base.file.regex;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args){
        System.out.println("enter pattern:");
        Scanner in = new Scanner(System.in);
        String patternStr = in.nextLine();
        Pattern pattern = Pattern.compile(patternStr);

        while (true)
        {
            System.out.println("enter content:");
            String content = in.nextLine();
            Matcher matcher = pattern.matcher(content);
            if (matcher.matches())
            {
                System.out.println("match");
            } else {
                if (content.equals("exit"))
                {
                    break;
                }
            }
        }
    }

}
