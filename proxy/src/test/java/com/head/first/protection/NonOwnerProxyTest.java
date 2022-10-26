package com.head.first.protection;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NonOwnerProxyTest {
    
    @Test
    @DisplayName("Deveria lançar exceção ao tentar alterar os interesses")
    public void test1() {
        var nonOwnerProxy = NonOwnerProxy.getOnwerProxy(new PersonBeanImpl("Pedro", "M"));
        assertThrows(IllegalArgumentException.class, () -> nonOwnerProxy.setInterests("asdfasdf"));
    }

    @Test
    @DisplayName("Não deveria lançar exceção ao atribuir um rating")
    public void test2() {
        var nonOwnerProxy = NonOwnerProxy.getOnwerProxy(new PersonBeanImpl("Pedro", "M"));
        assertDoesNotThrow(() -> nonOwnerProxy.setHotOrNotRating(5));
    }
}
