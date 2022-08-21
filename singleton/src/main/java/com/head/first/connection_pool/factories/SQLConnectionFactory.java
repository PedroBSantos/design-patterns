package com.head.first.connection_pool.factories;

import com.head.first.connection_pool.DatabaseType;
import com.head.first.connection_pool.connection.ManagmedConnection;

public abstract class SQLConnectionFactory {

    public abstract ManagmedConnection create(String connectionString);

    public static SQLConnectionFactory getFactory(DatabaseType type) {
        if (type == DatabaseType.MYSQL) {
            return new MySQLConnectionFactory();
        }
        if (type == DatabaseType.POSTGRESQL) {
            return new PostgreSQLConnectionFactory();
        }
        throw new RuntimeException("Could not find factory for database " + type);
    }
}
