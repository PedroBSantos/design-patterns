package com.head.first.migration;

import java.time.LocalDate;
import java.util.UUID;

public class DropTableCommand<T> implements MigrationCommand<T> {

    private SQLConnection connection;
    private Class<T> classMapping;

    public DropTableCommand(SQLConnection connection, Class<T> classMapping) {
        this.connection = connection;
        this.classMapping = classMapping;
    }

    @Override
    public void execute() {
        var className = classMapping.getSimpleName();
        var sqlBuilder = new StringBuilder();
        sqlBuilder.append("DROP TABLE ")
                .append(className);
        this.connection.query(sqlBuilder.toString());
    }

    @Override
    public void undo() {
        var className = classMapping.getSimpleName();
        var fields = classMapping.getDeclaredFields();
        var sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE ")
                .append(className)
                .append(" (");
        for (int i = 0; i < fields.length; i++) {
            var fieldName = fields[i].getName();
            sqlBuilder.append(fieldName)
                    .append(" ")
                    .append(this.mapClassToSQLType(fields[i].getType().getSimpleName()));
            if (i < fields.length - 1) {
                sqlBuilder.append(",\n");
            }
        }
        sqlBuilder.append(")");
        this.connection.query(sqlBuilder.toString());
    }

    private String mapClassToSQLType(String className) {
        if (UUID.class.getSimpleName().equals(className)) {
            return "varchar(36)";
        }
        if (LocalDate.class.getSimpleName().equals(className)) {
            return "date";
        }
        if (String.class.getSimpleName().equals(className)) {
            return "varchar(255)";
        }
        throw new RuntimeException("Can not map " + className + " to sql type");
    }
}
