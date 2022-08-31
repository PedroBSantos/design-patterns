package com.head.first.repository;

import java.util.UUID;

public interface AccountJpaRepository {
    
    void save(Account account);

    Account findById(UUID id);
}
