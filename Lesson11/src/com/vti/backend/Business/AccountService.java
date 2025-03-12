package com.vti.backend.Business;

import com.vti.backend.Data.AccountRepository;

/*
Mr.Son
 */
public class AccountService {
    public boolean login(String username, String password) {
        AccountRepository accRp = new AccountRepository();
        return accRp.login(username, password);

    }
}
