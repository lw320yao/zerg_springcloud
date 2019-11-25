package com.java.base.file;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class TestFileAsResourceTest {
    @Test
    public void read() {

        TestFileAsResource file = new TestFileAsResource();
        file.read();

    }
}
