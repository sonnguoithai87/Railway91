package com.vti.backend.DataLayer;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.frontend.Main;
import com.vti.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
Mr.Son
 */
public class AccountRepositoryImpl implements  IAccountRepository {

    @Override
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
            JDBCConnection.closeConnection(connection, pstmt, rs);
            return true;
        } else {
            System.out.println("Không Tồn tại user=> Login false");
            JDBCConnection.closeConnection(connection, pstmt, rs);
            return false;
        }
    }

    @Override
    public List<Account> getListAccount() throws SQLException {
        Connection connection = JDBCConnection.getConnection();
        String sql = "select * from accounts";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Account> listAccount = new ArrayList<>();
        while(rs.next()) {
            int id = rs.getInt("id");
            String userName  = rs.getString("username");
            String password =rs.getString("password");
            String lastname =rs.getString("lastname");
            int departmentId = rs.getInt("department_id");
            Department department = DepartmentRepository.getDepartmentById(departmentId);
            Account account = new Account(id, userName, password, lastname);
            account.setDepartment(department);
            listAccount.add(account);
        }
        JDBCConnection.closeConnection(connection, pstmt, rs);
        return listAccount;
    }

    @Override
    public boolean insertAccount(Account account) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = JDBCConnection.getConnection();
            String sql = "insert into accounts(username, password, lastname, department_id) values(?,?,?,?)";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, account.getUserName());
            pstmt.setString(2, account.getPassword());
            pstmt.setString(3, account.getLastName());
            pstmt.setInt(4, account.getDepartment().getDepartmentId());
            int insacc = pstmt.executeUpdate();
            JDBCConnection.closeConnection(connection, pstmt, null);
            return insacc > 0 ? true : false;
        } catch (SQLException e) {
            return false;
        } finally {
            JDBCConnection.closeConnection(connection, pstmt, null);
        }
    }

    @Override
    public boolean checkExitsAcc(String username) throws SQLException {
        Connection connection = JDBCConnection.getConnection();
        String sql = "select * from accounts where username = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()) {
            System.out.println("User đã Tồn tại user");
            JDBCConnection.closeConnection(connection, pstmt, rs);
            return true;
        } else {
            System.out.println("Không Tồn tại user");
            JDBCConnection.closeConnection(connection, pstmt, rs);
            return false;
        }
    }
}
