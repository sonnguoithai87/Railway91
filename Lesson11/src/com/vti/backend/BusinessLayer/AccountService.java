package com.vti.backend.BusinessLayer;

import com.vti.backend.DataLayer.AccountRepository;
import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

/*
Mr.Son
 */
public class AccountService {
    public boolean login(String username, String password) throws SQLException {
        AccountRepository accountRepository = new AccountRepository();
        //Ve sau se co 1 so dieu kien check o day
        return accountRepository.login(username, password);
    }

    public List<Account> getListAccount() throws SQLException {
        AccountRepository accountRepository = new AccountRepository();
        return accountRepository.getListAccount();

    }
}
