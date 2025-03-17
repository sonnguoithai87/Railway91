package com.vti.entity;

/*
Mr.Son
 */
public class Account {
    private int id;
    private String userName;
    private String password;
    private String lastName;
    private Department department;

    public Account(int id, String userName, String password, String lastName) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id:"+ this.id + "|username:"+this.userName + "|password:"+this.password + "|lastName:"+this.lastName + "|department:"+this.department.getDepartmentName();
    }
}
