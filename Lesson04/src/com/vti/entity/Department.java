package com.vti.entity;

/*
Mr.Son
 */
public class Department {
    private int id;
    private String departmentName;
    //Contructor Khong co tham so
    public Department() {
    }
    //Contructor Co tham so
    public Department(String departmentName) {
        this.id = 0;
        this.departmentName = departmentName;
    }
    public void setId(int id) {
     this.id = id;
    }
    public int getId() {
        return this.id;
    }
}
