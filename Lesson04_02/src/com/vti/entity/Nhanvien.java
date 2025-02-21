package com.vti.entity;

/*
Mr.Son
 */
public class Nhanvien extends Canbo{
    private String congviec;

    public Nhanvien(String firtName, String lastName) {
        super(firtName, lastName);
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }
}
