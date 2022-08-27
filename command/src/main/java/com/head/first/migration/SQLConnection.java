package com.head.first.migration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

    private String connectionString;
    private Connection connection;

    public SQLConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public void open() {
        try {
            this.connection = DriverManager.getConnection(this.connectionString);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void query(String sql) {
        try {
            var statement = this.connection.prepareStatement(sql);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
