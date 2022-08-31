package com.head.first.repository;

import java.util.UUID;

public class AccountJpaRepositoryAdapter implements AccountDAO {

    private AccountJpaRepository accountJpaRepository;

    public AccountJpaRepositoryAdapter(AccountJpaRepository accountJpaRepository) {
        this.accountJpaRepository = accountJpaRepository;
    }

    @Override
    public void create(Account account) {
        this.accountJpaRepository.save(account);
    }

    @Override
    public Account getById(UUID id) {
        return this.accountJpaRepository.findById(id);
    }

    @Override
    public void update(Account account) {
        this.accountJpaRepository.save(account);
    }
}
