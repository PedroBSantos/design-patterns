package com.head.first.database;

public class PostgreSQLConnectionFactory extends SQLConnectionFactory {

    @Override
    public SQLConnection createConnection(String connectionString) {
        return new PostgreSQLConnection(connectionString);
    }
}
