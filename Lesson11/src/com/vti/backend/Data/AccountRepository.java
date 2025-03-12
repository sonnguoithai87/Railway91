package com.vti.backend.Data;

/*
Mr.Son
 */
public class AccountRepository {

    public boolean login(String username, String password) {
        //ve sau phai ket noi database de check
        if (username.equals("sonnv") && password.equals("123456")) {
            return true;
        } else {
            return false;
        }

    }
}
