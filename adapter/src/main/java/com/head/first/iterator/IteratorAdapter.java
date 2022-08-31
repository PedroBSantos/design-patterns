package com.head.first.iterator;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter<T> implements Enumeration<T> { // Faz com que um enumeration se pareça com um iterator

    private Iterator<T> iterator;

    public IteratorAdapter(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return this.iterator.next();
    }
}
