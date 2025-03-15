package com.vti.utils;


import java.sql.*;

/*
Mr.Son
 */
public class JDBCConnection {

    public static void main(String[] args) throws SQLException {
//        String urlConnection = "jdbc:mysql://localhost:3306/railway91";
//        //String urlConnection = "jdbc:mysql://127.0.0.1:3306/railway91";
//        String userName = "root";
//        String password = "123456";
//        //Class.forName()
//        Connection connection = DriverManager.getConnection(urlConnection, userName, password);
//        if (connection != null) {
//            System.out.println("Connection Oki. Done");
//        } else {
//            System.out.println("Connection Error");
//        }
//        //String dieukien  = " username =  sonnv or 1 = 1";
//        //tao doi tuong statement
//        Statement stmt = connection.createStatement();
//
//        //Tao cau lenh sql
//        String sql = "select id, username, password from accounts";
//        ResultSet rs = stmt.executeQuery(sql);
//        while (rs.next()) {
//            int id = rs.getInt(1);
//            int id2 = rs.getInt("id");
//            String username = rs.getString("username");
//            System.out.println("Ket qua:" + id + "|" + username);
//
//        }
//
//        rs.close();
//
//        String sqlInsert = "insert into accounts (username, password, lastname, firstname) " +
//                " values ( 'sonnv1', '123456', 'Sonv1', 'Nguyen Van')";
//        int ketqua = stmt.executeUpdate(sqlInsert);
//        if (ketqua > 0) {
//            System.out.println("them moi thanh cong");
//        } else {
//            System.out.println("THem moi that bại");
//        }
//
//        String sqlUpdate = "update  accounts set fullname = lastname where id = 4";
//        int ketqua2 = stmt.executeUpdate(sqlUpdate);
//        if (ketqua2 > 0) {
//            System.out.println("Update thanh cong");
//        } else {
//            System.out.println("Update that bại");
//        }
    }

    public static Connection getConnection() throws SQLException {
        String urlConnection = "jdbc:mysql://localhost:3306/railway91";
        //String urlConnection = "jdbc:mysql://127.0.0.1:3306/railway91";
        String userName = "root";
        String password = "123456";
        //Class.forName()
        Connection connection = DriverManager.getConnection(urlConnection, userName, password);
        if (connection != null) {
            System.out.println("Connection Oki. Done");
        } else {
            System.out.println("Connection Error");
        }
        return connection;
    }

    public static void colseConnection(Connection connection, PreparedStatement pstmt, ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();

        }
        if (pstmt != null) {
            pstmt.close();
        }
        if (connection != null) {
            connection.close();
        }
    }


}
