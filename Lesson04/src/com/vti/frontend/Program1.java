package com.vti.frontend;

import com.vti.backend.Exercices01;
import com.vti.entity.Account;

/*
Mr.Son
 */
public class Program1 {
    public static void maind(String[] args) {
       Main main = new Main();
        Account account = new Account();
        account.setId(1);
        account.setAccName("tuan");
        account.setFullName("Nguyeen Van Son");
        account.setEmail("nguyen van son@gmail.com");
        Account account3 = new Account();
        account3.setId(1);
        account3.setAccName("tuan");
        account3.setFullName("Nguyeen Van Son");
        account3.setEmail("nguyen van son@gmail.com");

        Account account2 = new Account(1, "Tuan","Nguyn van son", "Abc@gmail", "NGuyen Van");
        Account account4 = new Account(1, "Tuan","Nguyn van son", "Abc@gmail", "NGuyen Van");
    }
}
