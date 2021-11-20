package com.design.patterns.services;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;

import org.junit.Test;

public class CalcularDescontoServiceTest {

    @Test
    public void test1() {
        var calcularDescontoService = new CalcularDescontoService();
        var orcamento = new Orcamento(new BigDecimal("100"), 1);
        var desconto = calcularDescontoService.calcular(orcamento);
        assertEquals(BigDecimal.ZERO, desconto);
    }

    @Test
    public void test2() {
        var calcularDescontoService = new CalcularDescontoService();
        var orcamento = new Orcamento(new BigDecimal("100"), 5);
        var desconto = calcularDescontoService.calcular(orcamento);
        assertEquals(BigDecimal.ZERO, desconto);
    }

    @Test
    public void test3() {
        var calcularDescontoService = new CalcularDescontoService();
        var orcamento = new Orcamento(new BigDecimal("200"), 6);
        var desconto = calcularDescontoService.calcular(orcamento);
        assertEquals(new BigDecimal("20.0"), desconto);
    }

    @Test
    public void test4() {
        var calcularDescontoService = new CalcularDescontoService();
        var orcamento = new Orcamento(new BigDecimal("600"), 1);
        var desconto = calcularDescontoService.calcular(orcamento);
        assertEquals(new BigDecimal("60.0"), desconto);
    }

    @Test
    public void test5() {
        var calcularDescontoService = new CalcularDescontoService();
        var orcamento = new Orcamento(new BigDecimal("600"), 6);
        var desconto = calcularDescontoService.calcular(orcamento);
        assertEquals(new BigDecimal("120.0"), desconto);
    }
}
