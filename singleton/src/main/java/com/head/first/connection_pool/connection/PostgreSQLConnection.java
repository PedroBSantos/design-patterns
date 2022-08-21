package com.head.first.connection_pool.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class PostgreSQLConnection extends SQLConnection {

    public PostgreSQLConnection(String connectionString) {
        this.connectionString = connectionString;
        this.inUse = false;
    }

    @Override
    public void open() {
        try {
            this.connection = DriverManager.getConnection(this.connectionString);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void query(String sql) {
        Logger.getLogger(MySQLConnection.class.getSimpleName())
                .info("Running query on PostgreSQL database");
    }
}
