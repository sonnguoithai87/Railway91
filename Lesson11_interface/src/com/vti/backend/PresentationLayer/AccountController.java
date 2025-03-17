package com.vti.backend.PresentationLayer;

import com.vti.backend.BusinessLayer.AccountServiceImpl;
import com.vti.backend.BusinessLayer.IAccountService;
import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

/*
Mr.Son
 */
public class AccountController {
    public boolean login(String username, String password) throws SQLException {
        IAccountService accountService = new AccountServiceImpl();
        return accountService.login(username, password);
    }

    public List<Account> getListAccount() throws SQLException {
        IAccountService accountService = new AccountServiceImpl();
        return accountService.getListAccount();

    }
}
