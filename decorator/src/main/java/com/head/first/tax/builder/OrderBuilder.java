package com.head.first.tax.builder;

import java.time.LocalDateTime;
import java.util.UUID;

import com.head.first.tax.Product;

public interface OrderBuilder {
    
    OrderBuilder withDate(LocalDateTime orderDate);

    OrderBuilder withId(UUID orderId);

    OrderBuilder withProduct(int amount, Product product);

    TaxBuilder skipToTaxs();
}
