package com.springboot.crud.AccountsSpring.models;

import org.springframework.data.repository.CrudRepository;

public interface AppAccountsRepo extends CrudRepository<AppAccounts,Integer> {
}
