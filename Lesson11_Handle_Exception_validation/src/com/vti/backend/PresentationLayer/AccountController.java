package com.vti.backend.PresentationLayer;

import com.vti.backend.BusinessLayer.AccountServiceImpl;
import com.vti.backend.BusinessLayer.IAccountService;
import com.vti.entity.Account;
import com.vti.entity.Department;

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

    public boolean insertAccount(String userName, String password, int deparmtentId) throws SQLException {
        if(password.length() < 6) {
            System.out.println("Mật khảu phải từ 6 ky tu tro len");
            return false;
        }
        Account acc = new Account();
        acc.setUserName(userName);
        acc.setPassword(password);
        Department department = new Department();
        department.setDepartmentId(deparmtentId);
        acc.setDepartment(department);
        IAccountService accountService = new AccountServiceImpl();
        return accountService.insertAccount(acc);
    }
}
