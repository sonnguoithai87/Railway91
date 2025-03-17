package com.vti.backend.BusinessLayer;

import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

/*
Mr.Son
 */
public interface IAccountService {
    public boolean login(String username, String password) throws SQLException;
    public List<Account> getListAccount() throws SQLException;
}
