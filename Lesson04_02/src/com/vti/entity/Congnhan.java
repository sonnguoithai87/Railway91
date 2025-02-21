package com.vti.entity;

/*
Mr.Son
 */
public class Congnhan extends  Canbo{
   private int capbac;

 public Congnhan(String firtName, String lastName) {
  super(firtName, lastName);
 }

 public int getCapbac() {
  return capbac;
 }

 public void setCapbac(int capbac) {
  this.capbac = capbac;
 }
}
