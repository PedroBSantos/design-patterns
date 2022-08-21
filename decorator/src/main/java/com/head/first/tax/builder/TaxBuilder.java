package com.head.first.tax.builder;

import com.head.first.tax.Taxable;

public interface TaxBuilder {

    TaxBuilder withICMSPercentage(double percentage);

    TaxBuilder withISSPercentage(double percentage);

    Taxable build();
}
