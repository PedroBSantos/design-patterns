package com.head.first.migration;

public class MigrationExecutor {

    public <T> void execute(MigrationCommand<T> command) {
        command.execute();
    }

    public <T> void undo(MigrationCommand<T> command) {
        command.undo();
    }
}
