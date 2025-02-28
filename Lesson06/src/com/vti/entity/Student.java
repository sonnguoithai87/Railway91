package com.vti.entity;

/*
Mr.Son
 */
public class Student {
    private int id;
    private String name;

    public void display(String name) {
        System.out.println("Tên của bạn la: Nguyễn Văn B");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
