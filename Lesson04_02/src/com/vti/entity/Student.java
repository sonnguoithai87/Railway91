package com.vti.entity;

/*
Mr.Son
 */
public class Student {
    private int id;
    private String name;
    private String hometown;
    private double mark;

    //COntructor
    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.mark = 0;
    }

    //set diem
    public void setMark(double mark) {
        this.mark = mark;
    }

    //Bonus diem
    public void plusMark(double bonusMark) {
        this.mark = this.mark + bonusMark;
    }

    //In thong tin
    public void showInfo () {
     System.out.println("Tên:"+ this.name + " | Học lục: " + (this.mark < 4 ? "yếu" : this.mark  < 6? "Trung binh" : this.mark  < 8? "Khá" : "Giỏi"));

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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


}
