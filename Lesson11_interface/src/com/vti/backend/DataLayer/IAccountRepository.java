package com.vti.backend.DataLayer;

import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

/*
Mr.Son
 */
public interface IAccountRepository
{
    public boolean login(String username, String password) throws SQLException;
    public List<Account> getListAccount() throws SQLException;
}
