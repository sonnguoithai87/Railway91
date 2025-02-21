package com.vti.entity;

import com.vti.utils.Gender;

/*
Mr.Son
 */
public class Canbo {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private String address;

    public Canbo(String firtName, String lastName) {
      this.firstName = firtName;
      this.lastName = lastName;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
