package com.head.first.restaurante;

import java.util.LinkedList;
import java.util.Queue;

public class Garconete {

    private final String nome;
    private Queue<PedidoCommand> pedidos;

    public Garconete(String nome) {
        this.nome = nome;
        this.pedidos = new LinkedList<PedidoCommand>();
    }

    public String getNome() {
        return nome;
    }

    public void anotarPedido(PedidoCommand pedidoCommand) {
        this.pedidos.add(pedidoCommand);
    }

    public void encaminharPedido() {
        var pedido = this.pedidos.poll();
        pedido.execute();
    }
}
