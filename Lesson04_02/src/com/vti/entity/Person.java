package com.vti.entity;

/*
Mr.Son
 */
public class Person {
    protected int id;
    protected String name;
    protected int age;

    public Person(String name){
       this.name = name;
       System.out.println("Contructor lơp person");
    }

    public void setId(int id) {
        this.id = id;

    }
}
