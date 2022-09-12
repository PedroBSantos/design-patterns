package com.head.first.data_parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DataParsingTest {
    
    @Test
    @DisplayName("Deveria fazer a extração e carga de dados json")
    public void test1() {
        DataParsing jsonDataParsing = new JsonDataParsing("src/test/java/com/head/first/data_parsing/data/customers.json");
        var customers = jsonDataParsing.loadCustomers();
        assertFalse(customers.isEmpty());
        assertEquals(5, customers.size());
    }

    @Test
    @DisplayName("Deveria fazer a extração e carga de dados txt")
    public void test2() {
        DataParsing txtDataParsing = new TxtDataParsing("src/test/java/com/head/first/data_parsing/data/customers.txt");
        var customer = txtDataParsing.loadCustomers();
        assertFalse(customer.isEmpty());
        assertEquals(5, customer.size());
    }
}
