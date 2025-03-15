package com.vti.backend.BusinessLayer;

import com.vti.backend.DataLayer.AccountRepository;

import java.sql.SQLException;

/*
Mr.Son
 */
public class AccountService {
    public boolean login(String username, String password) throws SQLException {
        AccountRepository accountRepository = new AccountRepository();
        //Ve sau se co 1 so dieu kien check o day
        return accountRepository.login(username, password);

    }
}
