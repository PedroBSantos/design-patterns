package com.head.first.pedido;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caixa extends Pedido {

    private List<Pedido> pedidos;

    public Caixa() {
        this.pedidos = new ArrayList<>();
    }

    @Override
    public void add(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    @Override
    public double calculatePrice() {
        return this.pedidos.stream().reduce(
                0.0, (subTotal, pedido) -> subTotal + pedido.calculatePrice(),
                Double::sum);
    }

    @Override
    public Pedido get(int id) {
        return this.pedidos.get(id);
    }

    @Override
    public void remove(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

    @Override
    public Iterator<Pedido> createIterator() {
        return new CompositeIterator(this.pedidos.iterator());
    }
}
