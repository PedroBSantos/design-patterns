package com.head.first.file_system;

import java.util.Iterator;
import java.util.Stack;

public class FolderIterator implements Iterator<FileSystem> {

    private Stack<Iterator<FileSystem>> items;

    public FolderIterator(Iterator<FileSystem> iterator) {
        this.items = new Stack<>();
        this.items.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (this.items.isEmpty()) {
            return false;
        }
        var topIterator = this.items.peek();
        if (!topIterator.hasNext()) {
            this.items.pop();
            return this.hasNext();
        }
        return true;
    }

    @Override
    public FileSystem next() {
        if (!this.hasNext()) {
            return null;
        }
        var topIterator = this.items.peek();
        var item = topIterator.next();
        if (item instanceof Folder) {
            this.items.push(item.createIterator());
        }
        return item;
    }
}
