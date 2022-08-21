package com.head.first.database;

public abstract class SQLConnectionFactory {

    public abstract SQLConnection createConnection(String connectionString);

    public final static SQLConnectionFactory getInstance(DatabaseType databaseType) {
        if (databaseType == DatabaseType.MYSQL) {
            return new MySQLConnectionFactory();
        }
        if (databaseType == DatabaseType.POSTGRES) {
            return new PostgreSQLConnectionFactory();
        }
        throw new RuntimeException("Database type not found");
    }
}
