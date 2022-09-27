package com.head.first.file_system;

import java.util.Iterator;

public abstract class FileSystem {
    
    public abstract String display();

    public void add(FileSystem item) {
        throw new UnsupportedOperationException();
    }

    public void remove(FileSystem item) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<FileSystem> createIterator();
}
