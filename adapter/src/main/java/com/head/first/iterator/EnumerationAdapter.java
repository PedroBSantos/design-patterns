package com.head.first.iterator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter<T> implements Iterator<T> { // Faz com que um Iterator se pareça com uma enumeration

    private Enumeration<T> enumeration;

    public EnumerationAdapter(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public T next() {
        return this.enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
