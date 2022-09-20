package com.head.first.pedido;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<Pedido> {

    private Stack<Iterator<Pedido>> pedidos;

    public CompositeIterator(Iterator<Pedido> iterator) {
        this.pedidos = new Stack<>();
        this.pedidos.push(iterator);
    }

    @Override
    public boolean hasNext() { // Método responsável por verificar se existe um próximo iterador e também de remover os elementos da pilha
        if (this.pedidos.isEmpty()) { // Verifica se a pilha está vazia
            return false;
        }
        var topIterator = this.pedidos.peek(); // Obtém o iterador que está no topo da pilha
        if (!topIterator.hasNext()) { // Se o iterador do topo da pilha não possuir um próximo, significa que ele deve ser removido da pilha e a busca reiniciada a partir do iterador abaixo dele
            this.pedidos.pop(); // Remove o iterador que está no topo da pilha
            return this.hasNext(); // Recomeça o processo a partir do novo iterador que está no topo da pilha
        }
        return true; // O iterador que está no topo da pilha possui um próximo elemento
    }

    @Override
    public Pedido next() { // Método responsável retornar um iterator e também popular a pilha
        if (!this.hasNext()) {
            return null;
        }
        var iterator = this.pedidos.peek(); // Obtém o iterador que está no topo da pilha, ele possui um próximo elemento
        var pedido = iterator.next(); // Obtém o próximo item da iteração
        if (pedido instanceof Caixa) { // Apenas é adicionado a pilha elementos folha
            this.pedidos.push(pedido.createIterator()); 
        }
        return pedido; // Independente do tipo, folha ou nó interno, o objeto é retornado
    }
}
