package com.head.first.pedido;

import java.util.Iterator;

public class NullIterator implements Iterator<Pedido> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Pedido next() {
        return null;
    }
}
