package com.head.first.pagamento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.pagamento.factories.*;
import com.head.first.pagamento.meios.*;

public class PagamentoFactoryTest {

    @Test
    @DisplayName("Deveria criar o meio de pagamento cartão de débito")
    public void test1() {
        var meioPagamentoFactory = MeioPagamentoFactory.getInstance(TipoMeioPagamento.DEBITO);
        assertInstanceOf(CartaoDebitoMeioPagamentoFactory.class, meioPagamentoFactory);
        assertInstanceOf(CartaoDebitoMeioPagamento.class, meioPagamentoFactory.getInstance());
    }

    @Test
    @DisplayName("Deveria criar o meio de pagamento cartão de crédito")
    public void test2() {
        var meioPagamentoFactory = MeioPagamentoFactory.getInstance(TipoMeioPagamento.CREDITO);
        assertInstanceOf(CartaoCreditoMeioPagamentoFactory.class, meioPagamentoFactory);
        assertInstanceOf(CartaoCreditoMeioPagamento.class, meioPagamentoFactory.getInstance());
    }

    @Test
    @DisplayName("Deveria criar o meio de pagamento boleto bancário")
    public void test3() {
        var meioPagamentoFactory = MeioPagamentoFactory.getInstance(TipoMeioPagamento.BOLETO);
        assertInstanceOf(BoletoBancarioMeioPagamentoFactory.class, meioPagamentoFactory);
        assertInstanceOf(BoletoBancarioMeioPagamento.class, meioPagamentoFactory.getInstance());
    }

    @Test
    @DisplayName("Deveria lançar uma RuntimeException quando não existir um factory handler para o meio de pagamento solicitado")
    public void test4() {
        var runtimeException = assertThrows(RuntimeException.class,
                () -> MeioPagamentoFactory.getInstance(TipoMeioPagamento.PIX));
        assertEquals("Não foi possível instanciar a factory para o meio de pagamento " + TipoMeioPagamento.PIX,
                runtimeException.getMessage());
    }
}
