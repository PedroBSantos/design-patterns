package com.head.first.pedido;

import java.util.Iterator;

public abstract class Pedido {
    
    public void add(Pedido pedido) {
        throw new UnsupportedOperationException();
    }

    public void remove(Pedido pedido) {
        throw new UnsupportedOperationException();
    }

    public Pedido get(int id) {
        throw new UnsupportedOperationException();
    }

    public double calculatePrice() {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<Pedido> createIterator();
}
