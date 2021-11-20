package com.design.patterns.services;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import com.design.patterns.entities.Orcamento;
import com.design.patterns.strategies.ICMSStrategy;
import com.design.patterns.strategies.ISSStrategy;

import org.junit.Test;

public class CalcularImpostoServiceTest {

    @Test
    public void test1() {
        var orcamento = new Orcamento(new BigDecimal("100"));
        var impostoStrategy = new ICMSStrategy();
        var calcularImpostoService = new CalcularImpostoService();
        var valorImposto = calcularImpostoService.calcular(orcamento, impostoStrategy);
        assertEquals(new BigDecimal("10.0"), valorImposto);
    }

    @Test
    public void test2() {
        var orcamento = new Orcamento(new BigDecimal("100"));
        var impostoStrategy = new ISSStrategy();
        var calcularImpostoService = new CalcularImpostoService();
        var valorImposto = calcularImpostoService.calcular(orcamento, impostoStrategy);
        assertEquals(new BigDecimal("6.00"), valorImposto);
    }
}
