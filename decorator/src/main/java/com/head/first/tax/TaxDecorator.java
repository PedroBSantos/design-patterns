package com.head.first.tax;

public abstract class TaxDecorator implements Taxable {
    
    protected Taxable tax;
    protected double percentage;
}
