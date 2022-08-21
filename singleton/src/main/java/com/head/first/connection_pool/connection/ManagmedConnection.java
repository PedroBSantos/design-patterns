package com.head.first.connection_pool.connection;

public interface ManagmedConnection {

    void open();

    void close();

    boolean isInUse();

    void setInUse();
}
