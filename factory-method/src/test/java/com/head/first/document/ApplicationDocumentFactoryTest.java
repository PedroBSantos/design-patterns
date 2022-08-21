package com.head.first.document;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApplicationDocumentFactoryTest {

    @Test
    @DisplayName("Deve retornar uma instância de WordDocument")
    public void test1() {
        Application wordApplication = new WordApplication();
        Document wordDocument = wordApplication.createDocument();
        assertTrue(wordDocument instanceof WordDocument);
    }

    @Test
    @DisplayName("Deve retornar uma instância de ExcelDocument")
    public void test2() {
        Application excelApplication = new ExcelApplication();
        Document excelDocument = excelApplication.createDocument();
        assertTrue(excelDocument instanceof ExcelDocument);
    }

    @Test
    @DisplayName("Deve retornar uma instância de TextDocument")
    public void test3() {
        Application textApplication = new TextApplication();
        Document textDocument = textApplication.createDocument();
        assertTrue(textDocument instanceof TextDocument);
    }
}
