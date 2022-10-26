package com.head.first.protection;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OwnerProxyTest {
    
    @Test
    @DisplayName("Não deveria lançar exceção")
    public void test1() {
        var ownerProxy = OwnerProxy.getOnwerProxy(new PersonBeanImpl("Pedro", "M"));
        assertDoesNotThrow(() -> ownerProxy.getName());
        assertDoesNotThrow(() -> ownerProxy.getInterests());
        assertDoesNotThrow(() -> ownerProxy.getGender());
        assertDoesNotThrow(() -> ownerProxy.getHotOrNotRating());
    }

    @Test
    @DisplayName("Deveria lançar exceção ao tentar alterar o próprio rating")
    public void test2() {
        var ownerProxy = OwnerProxy.getOnwerProxy(new PersonBeanImpl("Pedro", "M"));
        assertThrows(IllegalArgumentException.class, () -> ownerProxy.setHotOrNotRating(10));
    }

    @Test
    @DisplayName("Não deveria lançar exceção")
    public void test3() {
        var ownerProxy = OwnerProxy.getOnwerProxy(new PersonBeanImpl("Pedro", "M"));
        assertDoesNotThrow(() -> ownerProxy.setInterests("asdfsadf"));
    }
}
