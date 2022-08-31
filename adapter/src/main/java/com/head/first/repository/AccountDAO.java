package com.head.first.repository;

import java.util.UUID;

public interface AccountDAO {

    void create(Account account);

    Account getById(UUID id);

    void update(Account account);
}
