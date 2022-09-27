package com.head.first.file_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder extends FileSystem {

    private String name;
    private List<FileSystem> children;
    private Iterator<FileSystem> iterator;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public final String display() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        for (var item : children) {
            stringBuilder.append("\n ")
                    .append(item.display());
        }
        return stringBuilder.toString();
    }

    @Override
    public final void add(FileSystem item) {
        this.children.add(item);
    }

    @Override
    public final void remove(FileSystem item) {
        this.children.remove(item);
    }

    @Override
    public Iterator<FileSystem> createIterator() {
        if (this.iterator == null) {
            this.iterator = new FolderIterator(this.children.iterator());
        }
        return this.iterator;
    }

    @Override
    public String getName() {
        return name;
    }
}
