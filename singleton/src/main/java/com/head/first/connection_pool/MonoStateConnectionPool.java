package com.head.first.connection_pool;

import com.head.first.connection_pool.connection.SQLConnection;

public class MonoStateConnectionPool {
    
    public SQLConnection getConnection() {
        var optionalFreeConnection = MonoStateConnectionPoolConfig.getConnections()
            .stream()
            .filter(connection -> !connection.isInUse())
            .findFirst();
        if (optionalFreeConnection.isPresent()) {
            var connection = optionalFreeConnection.get();
            connection.setInUse();
            return (SQLConnection) connection;
        }
        throw new RuntimeException("All connections are in use");
    }
}
