package com.head.first.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.domain.entities.Borda;
import com.head.first.domain.entities.CalabresaPizzaChain;
import com.head.first.domain.entities.CalculoBasicoPizza;
import com.head.first.domain.entities.CalculoValorPizza;
import com.head.first.domain.entities.ModaCasaPizzaChain;
import com.head.first.domain.entities.PedidoPizzaObserver;
import com.head.first.domain.entities.SaborPizzaChain;
import com.head.first.domain.enums.BordaSize;
import com.head.first.domain.enums.BordaType;
import com.head.first.domain.enums.PizzaSize;
import com.head.first.domain.services.PedidoPizzaService;

public class PedidoPizzaServiceTest {

    private PedidoPizzaService pedidoPizzaService;
    private CalculoValorPizza calculoValorPizza;
    private SaborPizzaChain saborPizzaChain;

    public PedidoPizzaServiceTest() {
        var modaCasaPizzaChain = new ModaCasaPizzaChain();
        var calabresaPizzaChain = new CalabresaPizzaChain();
        calabresaPizzaChain.adicionarProximoSabor(modaCasaPizzaChain);
        this.saborPizzaChain = calabresaPizzaChain;
        this.calculoValorPizza = new CalculoBasicoPizza();
        this.pedidoPizzaService = new PedidoPizzaService(this.saborPizzaChain, this.calculoValorPizza);
    }
    
    @Test
    @DisplayName("A pizza de calabresa deve ser atribuida ao observer")
    public void test1() {
        var pedidoPizzaObserver = new PedidoPizzaObserver();
        this.pedidoPizzaService.attach(pedidoPizzaObserver);
        assertNull(pedidoPizzaObserver.getPizza());
        this.pedidoPizzaService.criarPedido("Calabresa", new Borda(BordaType.CATUPIRY, BordaSize.NORMAL), PizzaSize.GRANDE);
        assertNotNull(pedidoPizzaObserver.getPizza());
        assertEquals(pedidoPizzaObserver.getPizza().getSabor(), "Calabresa");
    }

    @Test
    @DisplayName("A pizza moda da casa deve ser atribuida ao observer")
    public void test2() {
        var pedidoPizzaObserver = new PedidoPizzaObserver();
        this.pedidoPizzaService.attach(pedidoPizzaObserver);
        assertNull(pedidoPizzaObserver.getPizza());
        this.pedidoPizzaService.criarPedido("Moda da Casa", new Borda(BordaType.CATUPIRY, BordaSize.NORMAL), PizzaSize.GRANDE);
        assertNotNull(pedidoPizzaObserver.getPizza());
        assertEquals(pedidoPizzaObserver.getPizza().getSabor(), "Moda da Casa");
    }
}
