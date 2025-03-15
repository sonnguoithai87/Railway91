package com.vti.backend.PresentationLayer;

import com.vti.backend.BusinessLayer.AccountService;

import java.sql.SQLException;

/*
Mr.Son
 */
public class AccountController {
    public boolean login(String username, String password) throws SQLException {
        AccountService acccountService = new AccountService();
        return acccountService.login(username, password);
    }
}
