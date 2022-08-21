package com.head.first.coffee.builder;

import com.head.first.coffee.Beverage;

public interface CondimentBuilder {

    CondimentBuilder withCaramel();

    CondimentBuilder withMocha();

    CondimentBuilder withSoy();

    CondimentBuilder withSteamedMilk();

    Beverage build();
}
