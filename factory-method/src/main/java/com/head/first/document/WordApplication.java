package com.head.first.document;

public class WordApplication extends Application {

    @Override
    protected Document createDocument() {
        WordDocument wordDocument = new WordDocument();
        return wordDocument;
    }
}
