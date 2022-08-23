package com.head.first.connection_pool;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MonoStateConnectionPoolTest {

    @Test
    @DisplayName("Deveria lançar uma exceção quando for solicitado uma nova conexão quando todas as conexões já estiverem em uso")
    public void test1() {
        MonoStateConnectionPoolConfig.databaseType = DatabaseType.POSTGRESQL;
        MonoStateConnectionPoolConfig.connectionString = "jdbc:postgresql://localhost:5432/reajuste?user=postgres&password=postgres";
        MonoStateConnectionPoolConfig.poolSize = 1;
        MonoStateConnectionPoolConfig.initializePool();
        var monoStateConnectionPool = new MonoStateConnectionPool();
        var exception = assertThrows(RuntimeException.class, () -> {
            monoStateConnectionPool.getConnection();
            monoStateConnectionPool.getConnection();
        });
        assertEquals("All connections are in use", exception.getMessage());
    }
}
