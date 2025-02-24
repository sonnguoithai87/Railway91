package com.vti.entity;

/*
Mr.Son
 */
public class Teacher implements IStudy {
    private int id;
    private String name;
    @Override
    public void diemDanh() {
        System.out.println("Giáo viên điểm danh");
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
