package com.head.first.coffe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.coffee.BeverageSize;
import com.head.first.coffee.DarkRoast;
import com.head.first.coffee.decorators.CaramelDecorator;
import com.head.first.coffee.decorators.SoyDecorator;
import com.head.first.coffee.decorators.SteamedMilkDecorator;

public class CoffeeTest {
    

    @Test
    @DisplayName("Deveria calcular o valor de Dark Roast com Caramel e Steamed Milk")
    public void test1() {
        var beverage = new SteamedMilkDecorator("Steamed Milk", 
            new CaramelDecorator("Caramel Side", 
            new DarkRoast("Most Excellent Dark Roast", BeverageSize.TALL)));
        assertEquals(8.0, beverage.cost());
    }

    @Test
    @DisplayName("Deveria calcular o valor de Dark Roast com Caramel e Soy baseado no tamanho do café")
    public void test2() {
        var beverage = new CaramelDecorator("Caramel Side", 
            new SoyDecorator("Soy side", 
            new DarkRoast("Most Excellent Dark Roast", BeverageSize.TALL)));
        assertEquals(7.6, beverage.cost());
    }
}
