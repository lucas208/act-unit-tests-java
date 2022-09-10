package br.ufrn.imd.repositories;

import br.ufrn.imd.models.BankAccount;

public interface Repository {
    BankAccount get(String uuid);
    Throwable create(BankAccount bankAccount);
    Throwable update (BankAccount bankAccount);
}
