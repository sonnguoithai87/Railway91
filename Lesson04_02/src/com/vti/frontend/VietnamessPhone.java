package com.vti.frontend;

import com.vti.entity.Contact;
import com.vti.entity.Phone;

import java.io.OptionalDataException;

/*
Mr.Son
 */
public class VietnamessPhone extends Phone {


    @Override
    public void insertContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        for (int i = 0; i < contacts.length; i ++ ) {
            if (contacts[i] == null) {
                contacts[i] = contact;
            }
        }
    }

    @Override
    public void removeContact(String name) {
        for (int i = 0; i < contacts.length; i ++ ) {
            if (contacts[i] != null) {
               if(contacts[i].getName().equalsIgnoreCase(name)) {
                   contacts[i] = null;
               }
            }
        }

    }

    @Override
    public void updateContact(String name, String newPhone) {

    }

    @Override
    public void seachContact(String name) {

    }
}
