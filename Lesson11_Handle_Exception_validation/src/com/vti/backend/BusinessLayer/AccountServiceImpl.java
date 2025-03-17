package com.vti.backend.BusinessLayer;

import com.vti.backend.DataLayer.AccountRepositoryImpl;
import com.vti.backend.DataLayer.IAccountRepository;
import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

/*
Mr.Son
 */
public class AccountServiceImpl implements  IAccountService{
    @Override
    public boolean login(String username, String password) throws SQLException {
        IAccountRepository accountRepository = new AccountRepositoryImpl();
        //Ve sau se co 1 so dieu kien check o day
        return accountRepository.login(username, password);
    }
    @Override
    public List<Account> getListAccount() throws SQLException {
        IAccountRepository accountRepository = new AccountRepositoryImpl();
        return accountRepository.getListAccount();

    }

    @Override
    public boolean insertAccount(Account account) throws SQLException {
        IAccountRepository accountRepository = new AccountRepositoryImpl();
        boolean exitsAcc  = accountRepository.checkExitsAcc(account.getUserName());
        if(exitsAcc) {
            return false;
        }else {
            return accountRepository.insertAccount(account);
        }
    }
}
