package com.head.first.mobilia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MobiliaFactoryTest {
    
    @Test
    @DisplayName("Deveria construir objetos do tipo modern mobilia")
    public void test1() {
        var modernMobiliaFactory = new MordenMobiliaFactory();
        var chair = modernMobiliaFactory.createChair();
        var coffeeTable = modernMobiliaFactory.createCoffeeTable();
        var sofa = modernMobiliaFactory.createSofa();
        assertTrue(chair instanceof ModernChair);
        assertTrue(coffeeTable instanceof ModernCoffeeTable);
        assertTrue(sofa instanceof MordernSofa);
    }

    @Test
    @DisplayName("Deveria construir objetos do tipo victorian mobilia")
    public void test2() {
        var victorianMobiliaFactory = new VictorianMobiliaFactory();
        var chair = victorianMobiliaFactory.createChair();
        var coffeeTable = victorianMobiliaFactory.createCoffeeTable();
        var sofa = victorianMobiliaFactory.createSofa();
        assertTrue(chair instanceof VictorianChair);
        assertTrue(coffeeTable instanceof VictorianCoffeeTable);
        assertTrue(sofa instanceof  VictorianSofa);
    }
}
