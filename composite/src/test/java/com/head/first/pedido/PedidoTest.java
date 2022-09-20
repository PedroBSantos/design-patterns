package com.head.first.pedido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    
    @Test
    @DisplayName("O pedido deveria custar 15000.0")
    public void test1() {
        var pedido = new Caixa();
        var caixaI7 = new Caixa();
        var caixaRTX3090 = new Caixa();
        caixaI7.add(new Produto("i7 12700K", 3000.0));
        caixaRTX3090.add(new Produto("RTX 3090", 12000.0));
        pedido.add(caixaI7);
        pedido.add(caixaRTX3090);
        pedido.add(new Produto("Nota Fiscal", 0.0));
        assertEquals(15000.0, pedido.calculatePrice());
    }

    @Test
    @DisplayName("Um pedido vazio deveria custar 0.0")
    public void test2() {
        var pedido = new Caixa();
        assertEquals(0.0, pedido.calculatePrice());
    }

    @Test
    @DisplayName("Deveria realizar 5 iterações")
    public void test3() {
        var count = 0;
        var pedido = new Caixa();
        var caixaI7 = new Caixa();
        var caixaRTX3090 = new Caixa();
        caixaI7.add(new Produto("i7 12700K", 3000.0));
        caixaRTX3090.add(new Produto("RTX 3090", 12000.0));
        pedido.add(caixaI7);
        pedido.add(caixaRTX3090);
        pedido.add(new Produto("Nota Fiscal", 0.0));
        var iterator = pedido.createIterator();
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        assertEquals(5, count);
    }
}
