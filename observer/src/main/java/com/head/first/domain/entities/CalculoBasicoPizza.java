package com.head.first.domain.entities;

import com.head.first.domain.enums.BordaType;
import com.head.first.domain.enums.PizzaType;

public class CalculoBasicoPizza implements CalculoValorPizza {

    @Override
    public float calcular(Pizza pizza) {
        var totalIngredientes = pizza.getIngredientes().size();
        var valorTotalIngredientes = totalIngredientes * 1.70;
        var valorTamanho = pizza.getSize().ordinal() * 10;
        var valorTipo = pizza.getType() == PizzaType.DOCE ? 10 : 0;
        var valorBorda = 0;
        if (pizza.possuiBorda()) {
            valorBorda = pizza.getBorda().getType() == BordaType.CHOCOLATE ? 
                5 * pizza.getBorda().getSize().ordinal() : 
                2 * pizza.getBorda().getSize().ordinal();
        }
        return (float)valorTotalIngredientes + valorTamanho + valorTipo + valorBorda;
    }
}
