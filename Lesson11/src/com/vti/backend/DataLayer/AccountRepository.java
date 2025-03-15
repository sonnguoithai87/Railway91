package com.vti.backend.DataLayer;

import com.vti.frontend.Main;
import com.vti.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
Mr.Son
 */
public class AccountRepository {

    public boolean login(String username, String password) throws SQLException {
        Connection connection = JDBCConnection.getConnection();
        String sql = "select * from accounts where username = ? and password = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()) {
            System.out.println("Tồn tại user=> Login thành cong");
            Main.isLogin = true;
            return true;
        } else {
            System.out.println("Không Tồn tại user=> Login false");
            return false;
        }

    }
}
