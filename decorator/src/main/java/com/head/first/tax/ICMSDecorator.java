package com.head.first.tax;

public class ICMSDecorator extends TaxDecorator {

    public ICMSDecorator(double percentage, Taxable tax) {
        this.percentage = percentage;
        this.tax = tax;
    }

    @Override
    public double calculatePrice() {
        var taxValue = this.tax.calculatePrice();
        return this.calculateICMSTax(taxValue) + taxValue;
    }

    public double calculateICMSTax(double value) {
        return this.percentage * value;
    }
}
