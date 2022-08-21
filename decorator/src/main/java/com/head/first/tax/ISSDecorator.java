package com.head.first.tax;

public class ISSDecorator extends TaxDecorator {

    public ISSDecorator(double percentage, Taxable tax) {
        this.percentage = percentage;
        this.tax = tax;
    }

    @Override
    public double calculatePrice() {
        var taxValue = this.tax.calculatePrice();
        return this.calculateISSTax(taxValue) + taxValue;
    }

    public double calculateISSTax(double value) {
        return this.percentage * value;
    }
}
