package com.vti.entity;

/*
Mr.Son
 */
public class Student implements IStudy{
    private int id;
    private String name;
    @Override
    public void diemDanh() {
        System.out.println("Sinh vien diem danh");
    }

    @Override
    public void lamBaiTapVeNha() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
