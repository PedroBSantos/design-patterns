package com.head.first.chains;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.domain.entities.Borda;
import com.head.first.domain.entities.CalabresaPizzaChain;
import com.head.first.domain.entities.ModaCasaPizzaChain;
import com.head.first.domain.enums.BordaSize;
import com.head.first.domain.enums.BordaType;
import com.head.first.domain.enums.PizzaSize;

public class SaborPizzaChainTest {

    @Test
    @DisplayName("Deve construir pizza moda da casa")
    public void test1() {
        var modaCasaPizzaChain = new ModaCasaPizzaChain();
        var calabresaPizzaChain = new CalabresaPizzaChain();
        calabresaPizzaChain.adicionarProximoSabor(modaCasaPizzaChain);
        var pizza = calabresaPizzaChain.obterPizza("Moda da Casa", new Borda(BordaType.CATUPIRY, BordaSize.NORMAL),
                PizzaSize.GRANDE);
        assertNotNull(pizza);
        assertEquals("Moda da Casa", pizza.getSabor());
    }

    @Test
    @DisplayName("Deve construir pizza de calabresa")
    public void test2() {
        var modaCasaPizzaChain = new ModaCasaPizzaChain();
        var calabresaPizzaChain = new CalabresaPizzaChain();
        modaCasaPizzaChain.adicionarProximoSabor(calabresaPizzaChain);
        var pizza = modaCasaPizzaChain.obterPizza("Calabresa", new Borda(BordaType.CATUPIRY, BordaSize.NORMAL),
                PizzaSize.GRANDE);
        assertNotNull(pizza);
        assertEquals("Calabresa", pizza.getSabor());
    }

    @Test
    @DisplayName("Deve lançar exceção quando não existir o sabor")
    public void test3() {
        var modaCasaPizzaChain = new ModaCasaPizzaChain();
        var calabresaPizzaChain = new CalabresaPizzaChain();
        modaCasaPizzaChain.adicionarProximoSabor(calabresaPizzaChain);
        assertThrows(RuntimeException.class, () -> modaCasaPizzaChain.obterPizza("Portuguesa",
                new Borda(BordaType.CATUPIRY, BordaSize.NORMAL), PizzaSize.GRANDE));
    }
}
