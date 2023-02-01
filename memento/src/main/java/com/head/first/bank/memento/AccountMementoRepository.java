package com.head.first.bank.memento;

import java.time.LocalDateTime;
import java.util.Optional;

public interface AccountMementoRepository {
    
    void add(AccountMemento memento);

    Optional<AccountMemento> getByCreationDate(LocalDateTime date);
}
