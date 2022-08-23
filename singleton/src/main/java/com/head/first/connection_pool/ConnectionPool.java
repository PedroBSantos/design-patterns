package com.head.first.connection_pool;

import java.util.ArrayList;
import java.util.List;

import com.head.first.connection_pool.connection.ManagmedConnection;
import com.head.first.connection_pool.connection.SQLConnection;
import com.head.first.connection_pool.factories.SQLConnectionFactory;

public class ConnectionPool {

    private String connectionString;
    private SQLConnectionFactory connectionFactory;
    private List<ManagmedConnection> connections;
    private int poolSize;
    private static volatile ConnectionPool connectionPool;

    private ConnectionPool(int poolSize, SQLConnectionFactory connectionFactory, String connectionString) {
        this.poolSize = poolSize;
        this.connectionFactory = connectionFactory;
        this.connectionString = connectionString;
        this.connections = new ArrayList<ManagmedConnection>();
    }

    private void initializePool() {
        for (int i = 0; i < this.poolSize; i++) {
            var createdConnection = this.connectionFactory.create(this.connectionString);
            createdConnection.open();
            this.connections.add(createdConnection);
        }
    }

    public SQLConnection getConnection() {
        var optionalFreeConnection = this.connections
            .stream()
            .filter(connection -> !connection.isInUse())
            .findFirst();
        if (optionalFreeConnection.isPresent()) {
            var connection = optionalFreeConnection.get();
            connection.setInUse();
            return (SQLConnection) connection;
        }
        throw new RuntimeException("All connections are in use");
    }

    public int getPoolSize() {
        return poolSize;
    }

    public static ConnectionPool getInstance(int poolSize, DatabaseType type, String connectionString) {
        if (ConnectionPool.connectionPool == null) {
            synchronized (ConnectionPool.class) {
                if (ConnectionPool.connectionPool == null) {
                    if (poolSize <= 0) {
                        throw new RuntimeException("Initial pool size must be equal or greater than 1");
                    }
                    var connectionFactory = SQLConnectionFactory.getFactory(type);
                    ConnectionPool.connectionPool = new ConnectionPool(poolSize, connectionFactory, connectionString);
                    ConnectionPool.connectionPool.initializePool();
                }
            }
        }
        return ConnectionPool.connectionPool;
    }
}
