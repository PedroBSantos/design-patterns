package com.head.first.builders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.domain.builders.PizzaModaCasaBuilder;
import com.head.first.domain.entities.Borda;
import com.head.first.domain.entities.CalculoBasicoPizza;
import com.head.first.domain.enums.*;

public class PizzaModaCasaBuilderTest {
    
    @Test
    @DisplayName("Deve construir uma pizza moda da casa")
    public void test1() {
        var pizzaModaCasaBuilder = new PizzaModaCasaBuilder();
        pizzaModaCasaBuilder.prepararBorda(new Borda(BordaType.CATUPIRY, BordaSize.NORMAL));
        pizzaModaCasaBuilder.prepararMassa(PizzaSize.NORMAL);
        pizzaModaCasaBuilder.colocarIngredientes();
        pizzaModaCasaBuilder.tempoForno();
        var pizza = pizzaModaCasaBuilder.tirarDoForno();
        assertEquals("Moda da Casa", pizza.getSabor());
        assertEquals(9, pizza.getIngredientes().size());
        assertEquals(PizzaType.SALGADA, pizza.getType());
        assertEquals(28, pizza.getTempoFornoMin());
        assertEquals(new Borda(BordaType.CATUPIRY, BordaSize.NORMAL), pizza.getBorda());
    }

    @Test
    @DisplayName("Deve calcular o valor do preço de 27.3")
    public void test2() {
        var pizzaModaCasaBuilder = new PizzaModaCasaBuilder();
        pizzaModaCasaBuilder.prepararBorda(new Borda(BordaType.CATUPIRY, BordaSize.NORMAL));
        pizzaModaCasaBuilder.prepararMassa(PizzaSize.NORMAL);
        pizzaModaCasaBuilder.colocarIngredientes();
        pizzaModaCasaBuilder.tempoForno();
        var pizza = pizzaModaCasaBuilder.tirarDoForno();
        pizza.setFormaCalculoPizza(new CalculoBasicoPizza());
        var valorPizza = pizza.calcularValor();
        assertEquals(27.3f, valorPizza);
    }
}
