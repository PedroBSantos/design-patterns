package com.head.first.connection_pool;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectionPoolSingletonTest {

    @Test
    @DisplayName("Deveria cria um pool de 2 conexões")
    public void test1() {
        var connectionPool1 = ConnectionPool.getInstance(1, DatabaseType.POSTGRESQL,
                "jdbc:postgresql://localhost:5432/reajuste?user=postgres&password=postgres");
        var connectionPool2 = ConnectionPool.getInstance(1, DatabaseType.POSTGRESQL,
                "jdbc:postgresql://localhost:5432/reajuste?user=postgres&password=postgres");
        assertTrue(connectionPool1 == connectionPool2);
        assertEquals(1, connectionPool1.getPoolSize());
        assertEquals(1, connectionPool2.getPoolSize());
    }

    @Test
    @DisplayName("Deveria lançar uma exceção quando for solicitado uma nova conexão, mas todas já estão em uso")
    public void test2() {
        var connectionPool = ConnectionPool.getInstance(1, DatabaseType.POSTGRESQL,
                "jdbc:postgresql://localhost:5432/reajuste?user=postgres&password=postgres");
        var exception = assertThrows(RuntimeException.class, () -> {
            connectionPool.getConnection();
            connectionPool.getConnection();
        });
        assertEquals("All connections are in use", exception.getMessage());
    }
}
