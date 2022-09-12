package com.head.first.data_parsing;

import java.util.List;

public abstract class DataParsing {

    public final List<Customer> loadCustomers() {
        connectDataSource();
        return extract();
    }

    public abstract void connectDataSource();

    public abstract List<Customer> extract();
}
