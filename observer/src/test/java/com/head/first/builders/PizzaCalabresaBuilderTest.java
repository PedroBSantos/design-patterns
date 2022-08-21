package com.head.first.builders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.domain.builders.PizzaCalabresaBuilder;
import com.head.first.domain.entities.Borda;
import com.head.first.domain.entities.CalculoBasicoPizza;
import com.head.first.domain.enums.*;

public class PizzaCalabresaBuilderTest {

    @Test
    @DisplayName("Deve construir uma pizza de calabresa")
    public void test1() {
        var calabresaPizzaBuilder = new PizzaCalabresaBuilder();
        calabresaPizzaBuilder.prepararBorda(new Borda(BordaType.CATUPIRY, BordaSize.NORMAL));
        calabresaPizzaBuilder.prepararMassa(PizzaSize.NORMAL);
        calabresaPizzaBuilder.colocarIngredientes();
        calabresaPizzaBuilder.tempoForno();
        var pizza = calabresaPizzaBuilder.tirarDoForno();
        assertEquals("Calabresa", pizza.getSabor());
        assertEquals(5, pizza.getIngredientes().size());
        assertEquals(PizzaType.SALGADA, pizza.getType());
        assertEquals(20, pizza.getTempoFornoMin());
        assertEquals(new Borda(BordaType.CATUPIRY, BordaSize.NORMAL), pizza.getBorda());
    }

    @Test
    @DisplayName("Deve calcular o valor do preço de 20.5")
    public void test2() {
        var calabresaPizzaBuilder = new PizzaCalabresaBuilder();
        calabresaPizzaBuilder.prepararBorda(new Borda(BordaType.CATUPIRY, BordaSize.NORMAL));
        calabresaPizzaBuilder.prepararMassa(PizzaSize.NORMAL);
        calabresaPizzaBuilder.colocarIngredientes();
        calabresaPizzaBuilder.tempoForno();
        var pizza = calabresaPizzaBuilder.tirarDoForno();
        pizza.setFormaCalculoPizza(new CalculoBasicoPizza());
        assertEquals(20.5f, pizza.calcularValor());
    }
}
