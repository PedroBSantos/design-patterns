package com.head.first.file_system;

import java.util.Iterator;

public class File extends FileSystem {

    private String name;
    private String extension;

    public File(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    @Override
    public final String display() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(".").append(extension);
        return stringBuilder.toString();
    }

    @Override
    public Iterator<FileSystem> createIterator() {
        return new FileIterator();
    }

    @Override
    public String getName() {
        return name;
    }
}
