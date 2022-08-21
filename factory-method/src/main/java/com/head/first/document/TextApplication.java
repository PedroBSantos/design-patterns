package com.head.first.document;

public class TextApplication extends Application {

    @Override
    protected Document createDocument() {
        TextDocument textDocument = new TextDocument();
        return textDocument;
    }
}
