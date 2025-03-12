package com.vti.backend.presentation;

import com.vti.backend.Business.AccountService;
import com.vti.backend.Data.AccountRepository;

/*
Mr.Son
 */
public class AccountController {
    public boolean login(String username, String password) {
        AccountService accsv = new AccountService();
        return accsv.login(username, password);
    }
}
