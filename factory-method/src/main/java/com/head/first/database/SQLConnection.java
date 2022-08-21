package com.head.first.database;

import java.sql.Connection;

public abstract class SQLConnection {

    protected String connectionString;
    protected Connection connection;

    public final Connection getConnection() {
        return connection;
    }

    public abstract void open();

    public abstract void close();
}
