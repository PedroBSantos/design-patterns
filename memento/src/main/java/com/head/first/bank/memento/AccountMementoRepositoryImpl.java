package com.head.first.bank.memento;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class AccountMementoRepositoryImpl implements AccountMementoRepository {

    private final Set<AccountMemento> mementos;

    public AccountMementoRepositoryImpl() {
        this.mementos = new HashSet<>();
    }

    @Override
    public void add(AccountMemento memento) {
        this.mementos.add(memento);
    }

    @Override
    public Optional<AccountMemento> getByCreationDate(LocalDateTime date) {
        return this.mementos
                .stream()
                .filter(memento -> memento.getCreatedAt().equals(date))
                .findFirst();
    }
}
