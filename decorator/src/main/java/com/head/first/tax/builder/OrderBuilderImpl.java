package com.head.first.tax.builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.head.first.tax.ICMSDecorator;
import com.head.first.tax.ISSDecorator;
import com.head.first.tax.Order;
import com.head.first.tax.OrderItem;
import com.head.first.tax.Product;
import com.head.first.tax.Taxable;

public class OrderBuilderImpl implements TaxBuilder, OrderBuilder {

    private LocalDateTime orderDate;
    private Taxable taxable;
    private UUID orderId;
    private List<OrderItem> orderItems;

    public OrderBuilderImpl() {
        this.orderItems = new ArrayList<OrderItem>();
    }

    @Override
    public OrderBuilder withDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    @Override
    public OrderBuilder withId(UUID orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public OrderBuilder withProduct(int amount, Product product) {
        this.orderItems.add(new OrderItem(amount, product));
        return this;
    }

    @Override
    public TaxBuilder skipToTaxs() {
        var order = new Order(this.orderId, this.orderDate);
        this.orderItems
                .forEach(orderItem -> order.addProduct(orderItem.getAmount(), orderItem.getProduct()));
        this.taxable = order;
        return this;
    }

    @Override
    public TaxBuilder withICMSPercentage(double percentage) {
        this.taxable = new ICMSDecorator(percentage, this.taxable);
        return this;
    }

    @Override
    public TaxBuilder withISSPercentage(double percentage) {
        this.taxable = new ISSDecorator(percentage, this.taxable);
        return this;
    }

    @Override
    public Taxable build() {
        return this.taxable;
    }
}
