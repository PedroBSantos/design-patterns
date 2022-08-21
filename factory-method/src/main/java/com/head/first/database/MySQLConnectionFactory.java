package com.head.first.database;

public class MySQLConnectionFactory extends SQLConnectionFactory {

    @Override
    public SQLConnection createConnection(String connectionString) {
        return new MySQLConnection(connectionString);
    }
}
