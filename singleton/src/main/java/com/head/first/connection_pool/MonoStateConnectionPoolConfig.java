package com.head.first.connection_pool;

import java.util.ArrayList;
import java.util.List;

import com.head.first.connection_pool.connection.ManagmedConnection;
import com.head.first.connection_pool.factories.SQLConnectionFactory;

public class MonoStateConnectionPoolConfig {
    
    public static String connectionString;
    public static int poolSize;
    public static DatabaseType databaseType;
    private static SQLConnectionFactory connectionFactory;
    private static List<ManagmedConnection> connections = new ArrayList<>();

    public static void initializePool() {
        MonoStateConnectionPoolConfig.connectionFactory = SQLConnectionFactory
            .getFactory(MonoStateConnectionPoolConfig.databaseType);
        for (int i = 0; i < MonoStateConnectionPoolConfig.poolSize; i++) {
            var newConnection = MonoStateConnectionPoolConfig.connectionFactory
                .create(MonoStateConnectionPoolConfig.connectionString);
            newConnection.open();
            MonoStateConnectionPoolConfig.connections.add(newConnection);
        }
    }

    public static List<ManagmedConnection> getConnections() {
        return MonoStateConnectionPoolConfig.connections.stream().toList();
    }

    public static int getPoolSize() {
        return MonoStateConnectionPoolConfig.poolSize;
    }
}
