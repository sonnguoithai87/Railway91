package com.vti.frontend;

import com.vti.backend.presentation.AccountController;

/*
Mr.Son
 */
public class Main {
    public static void main(String[] args) {
        AccountController accountController = new AccountController();

        boolean flagLogin = accountController.login("sonnv", "1234567");
        if (flagLogin) {
            System.out.println("Login thành cong");
        } else {
            System.out.println("Login thất bai");
        }

    }
}