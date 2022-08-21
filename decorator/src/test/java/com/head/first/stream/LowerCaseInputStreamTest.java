package com.head.first.stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LowerCaseInputStreamTest {

    @Test
    @DisplayName("Deveria converter todas os caracteres do arquivo para lower case")
    public void test1() {
        try (InputStream inputStream = new LowerCaseInputStream(
                new BufferedInputStream(new FileInputStream("file-test.txt")))) {
            int actualCharacter;
            while ((actualCharacter = inputStream.read()) >= 0) {
                assertTrue(Character.isLowerCase((char) actualCharacter));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
