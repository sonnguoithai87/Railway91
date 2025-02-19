package com.vti.entity;

import java.util.Date;

/*
Mr.Son
 */

public class Account {
  private int id;
  private String accName;
  private String fullName;
  private String email;
  private String firtName;
  private String lastName;
  private Date createDate;
  private Department department;
  private Position position;

  public Account() {


  }
  public Account(int id, String accName, String fullName, String email, String lastName) {
    this.id = id;
    this.accName = accName;
    this.fullName =  fullName;
    this.email = email;
    this.lastName = lastName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAccName() {
    return accName;
  }

  public void setAccName(String accName) {
    this.accName = accName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirtName() {
    return firtName;
  }

  public void setFirtName(String firtName) {
    this.firtName = firtName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }
}
