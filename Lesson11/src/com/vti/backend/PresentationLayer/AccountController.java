package com.vti.backend.PresentationLayer;

import com.vti.backend.BusinessLayer.AccountService;
import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

/*
Mr.Son
 */
public class AccountController {
    public boolean login(String username, String password) throws SQLException {
        AccountService acccountService = new AccountService();
        return acccountService.login(username, password);
    }

    public List<Account> getListAccount() throws SQLException {
        AccountService acccountService = new AccountService();
        return acccountService.getListAccount();

    }
}
