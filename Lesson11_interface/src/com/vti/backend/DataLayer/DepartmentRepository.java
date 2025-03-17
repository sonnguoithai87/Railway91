package com.vti.backend.DataLayer;

import com.vti.entity.Department;
import com.vti.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
Mr.Son
 */
public class DepartmentRepository {

    public static Department getDepartmentById(int deparmentId) throws SQLException {
        Connection connection = null;
        PreparedStatement pstmt =null;
        ResultSet rs = null;
        try {
            connection = JDBCConnection.getConnection();
            String sql = "select * from Department where department_id = ? ";
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, deparmentId);
            rs = pstmt.executeQuery();
            Department department = new Department();
            if (rs.next()) {
                department.setDepartmentId(deparmentId);
                department.setDepartmentName(rs.getString("department_name"));
            }
            return department;
        } catch (Exception e) {
            return null;
        } finally {
            JDBCConnection.closeConnection(connection, pstmt, rs);
        }
    }
}
