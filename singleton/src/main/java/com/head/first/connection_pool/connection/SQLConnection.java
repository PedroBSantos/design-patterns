package com.head.first.connection_pool.connection;

import java.sql.Connection;

public abstract class SQLConnection implements ManagmedConnection {

    protected Connection connection;
    protected String connectionString;
    protected boolean inUse;

    @Override
    public abstract void open();

    @Override
    public abstract void close();

    public abstract void query(String sql);

    @Override
    public final boolean isInUse() {
        return inUse;
    }

    @Override
    public final void setInUse() {
        this.inUse = !this.inUse;
    }
}
