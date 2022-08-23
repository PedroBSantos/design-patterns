package com.head.first.connection_pool;

import java.util.concurrent.Callable;

public class ConnectionPoolCallable implements Callable<ConnectionPool> {

    private int poolSize;
    private DatabaseType type;
    private String connectionString;

    public ConnectionPoolCallable(int poolSize, DatabaseType type, String connctionString) {
        this.poolSize = poolSize;
        this.type = type;
        this.connectionString = connctionString;
    }

    @Override
    public ConnectionPool call() throws Exception {
        return ConnectionPool.getInstance(poolSize, type, connectionString);
    }
}
