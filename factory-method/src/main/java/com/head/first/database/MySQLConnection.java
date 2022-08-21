package com.head.first.database;

public class MySQLConnection extends SQLConnection {

    public MySQLConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void open() {
        
    }

    @Override
    public void close() {

    }
}
