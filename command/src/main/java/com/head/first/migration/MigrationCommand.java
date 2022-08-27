package com.head.first.migration;

public interface MigrationCommand<T> {
    
    void execute();

    void undo();
}
