package com.java.base.file;

import com.java.base.generic.T;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Properties;

public class TestFileAsResource {

    public void read () {
        try {
            InputStream resourceAsStream = TestFileAsResource.class.getResourceAsStream("/template/test.json");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            String name = properties.getProperty("\"name\"");

            /*System.out.println(name);
            System.out.println(this.getClass().getClassLoader().getResource("/"));
            System.out.println(this.getClass().getResource("/").toString());
            System.out.println(TestFileAsResource.class.getResource("/"));
            System.out.println(TestFileAsResource.class.getClassLoader().getResource("/"));*/

            System.out.println(TestFileAsResource.class.getResource("/template/test.json"));

            String path = TestFileAsResource.class.getResource("/template/test.json").toString();
            path = path.replace("\\", "/");

            if (path.contains(":")) {
                path = path.replace("file:/","");
             }

            System.out.println(path);
            System.out.println(TestFileAsResource.class.getResource("/template/test.json").getPath());

            String str = FileUtils.readFileToString(new File(TestFileAsResource.class.getResource("/template/test.json").getPath()), "UTF-8");
            System.out.println(str);
            str = str.replace("{0}","\"2222\"");
            System.out.println(str);
            // System.out.println(MessageFormat.format(str,"dalihuiquan"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main (String[] args) {
        /*TestFileAsResource testFileAsResource = new TestFileAsResource();
        testFileAsResource.read();*/

        try {
            ClassPathResource resource = new ClassPathResource("template/test.json");
            String str = IOUtils.toString(resource.getInputStream(), "UTF-8");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
