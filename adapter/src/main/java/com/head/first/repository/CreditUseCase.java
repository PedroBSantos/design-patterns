package com.head.first.repository;

import java.util.UUID;

public class CreditUseCase {

    private AccountDAO accountDAO;

    public CreditUseCase(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public void execute(UUID accountId, double amount) {
        var account = this.accountDAO.getById(accountId);
        if (account == null) {
            throw new RuntimeException("No account found for id " + accountId.toString());
        }
        account.credit(amount);
        this.accountDAO.update(account);
    }
}
