package com.head.first.connection_pool.factories;

import com.head.first.connection_pool.connection.ManagmedConnection;
import com.head.first.connection_pool.connection.PostgreSQLConnection;

public class PostgreSQLConnectionFactory extends SQLConnectionFactory {

    @Override
    public ManagmedConnection create(String connectionString) {
        return new PostgreSQLConnection(connectionString);
    }
}
