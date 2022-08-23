package com.head.first.connection_pool;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

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
    @DisplayName("Deveria lançar uma exceção quando for solicitado uma nova conexão quando todas as conexões já estiverem em uso")
    public void test2() {
        var connectionPool = ConnectionPool.getInstance(1, DatabaseType.POSTGRESQL,
                "jdbc:postgresql://localhost:5432/reajuste?user=postgres&password=postgres");
        var exception = assertThrows(RuntimeException.class, () -> {
            connectionPool.getConnection();
            connectionPool.getConnection();
        });
        assertEquals("All connections are in use", exception.getMessage());
    }

    @Test
    @DisplayName("Deveria criar o mesmo pool de conexões em um cenário multi-thread")
    public void test3() throws InterruptedException, ExecutionException {
        var threadPool = Executors.newFixedThreadPool(3);
        var singleton1 = threadPool.submit(new ConnectionPoolCallable(1, DatabaseType.POSTGRESQL,
                "jdbc:postgresql://localhost:5432/reajuste?user=postgres&password=postgres"));
        var singleton2 = threadPool.submit(new ConnectionPoolCallable(1, DatabaseType.POSTGRESQL,
                "jdbc:postgresql://localhost:5432/reajuste?user=postgres&password=postgres"));
        assertEquals(singleton1.get(), singleton2.get());
    }
}
