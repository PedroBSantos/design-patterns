package com.head.first.document;

public class ExcelApplication extends Application {

    @Override
    protected Document createDocument() {
        ExcelDocument excelDocument = new ExcelDocument();
        return excelDocument;
    }
}
