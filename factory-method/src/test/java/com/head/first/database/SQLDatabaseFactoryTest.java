package com.head.first.database;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SQLDatabaseFactoryTest {

    @Test
    @DisplayName("Deveria criar um mysql database")
    public void test1() {
        var mysqlDatabase = SQLConnectionFactory
                .getInstance(DatabaseType.MYSQL)
                .createConnection("jdbc:mysql://localhost:3306/test?user=root&password=root");
        assertTrue(mysqlDatabase instanceof MySQLConnection);
    }

    @Test
    @DisplayName("Deveria criar um mysql database")
    public void test2() {
        var postgresDatabase = SQLConnectionFactory
                .getInstance(DatabaseType.POSTGRES)
                .createConnection(
                        "jdbc:postgresql://localhost:5432/reajuste?user=postgres&password=postgres");
        assertTrue(postgresDatabase instanceof PostgreSQLConnection);
    }
}
