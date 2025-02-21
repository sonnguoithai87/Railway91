package com.vti.entity;

/*
Mr.Son
 */
public abstract class Phone {
    public Contact[] contacts = new Contact[365];

    public abstract void insertContact(String name, String phoneNumber);

    public abstract void removeContact(String name);

    public abstract void updateContact(String name, String newPhone);

    public abstract void seachContact(String name);
}
