package com.vti.entity;

/*
Mr.Son
 */
public class Hieutruong extends Teacher{
    public float bonusSalary;

    public Hieutruong(String name) {
        super(name); //GOi contructor của lớp cha gần nhất
        System.out.println("Contructor của lớp HIeu trưởng");
    }
}
