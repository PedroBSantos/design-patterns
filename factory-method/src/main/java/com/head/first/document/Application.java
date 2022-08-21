package com.head.first.document;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {

    private List<Document> documents;

    protected Application() {
        this.documents = new ArrayList<>();
    }
    
    protected abstract Document createDocument();

    public void newDocument() {
        var document = this.createDocument();
        this.documents.add(document);
        document.open();
    }
}
