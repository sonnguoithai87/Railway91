package com.vti.utils;





import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/*
Mr.Son
 */
public class JDBCConnection2 {
    public static void main(String[] args) throws SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/resources/database.properties"));

        String urlConnection = properties.getProperty("urlConnection");
        String userName  = properties.getProperty("userName");
        String password  = properties.getProperty("password");

        //Class.forName()
        Connection connection = DriverManager.getConnection(urlConnection, userName, password);
        if(connection != null) {
            System.out.println("Connection Oki. Done");
        } else {
            System.out.println("Connection Error");
        }
        //String dieukien  = " username =  sonnv or 1 = 1";


        //Tao cau lenh sql
        String sql = "select id, username, password from accounts where id = ?" ;
        //tao doi tuong statement
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, 2);
        ResultSet rs =  pstmt.executeQuery();
        while(rs.next()) {
              int id = rs.getInt(1);
              int id2 = rs.getInt("id");
              String username = rs.getString("username");
              System.out.println("Ket qua:"+id + "|"+username);

        }

        rs.close();

        String sqlInsert = "insert into accounts (username, password, lastname, firstname) " +
                " values ( ?, ?, ?, ?)";
        PreparedStatement pstmt1 = connection.prepareStatement(sqlInsert);
        pstmt1.setString(1, "Vinh");
        pstmt1.setString(2, "123456");
        pstmt1.setString(3, "Vinh");
        pstmt1.setString(4, "Nguyen");
        int ketqua = pstmt1.executeUpdate();
        if(ketqua > 0) {
            System.out.println("them moi thanh cong");
        }else {
            System.out.println("THem moi that bại");
        }
        pstmt1.close();
        connection.close();
    }

}
