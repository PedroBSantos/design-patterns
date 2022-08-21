package com.head.first.mobilia;

public class MordenMobiliaFactory implements MobiliaFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new MordernSofa();
    }
}
