package com.vti.entity;

/*
Mr.Son
 */
public class Teacher extends Person {
    protected float salary;

    public Teacher(String name) {
        super(name); //Nó gọi contructor của lớp cha gần nhất
        System.out.println("Contructor của lớp teacher");
    }
}
