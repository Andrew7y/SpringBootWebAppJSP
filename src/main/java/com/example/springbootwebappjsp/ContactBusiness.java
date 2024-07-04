package com.example.springbootwebappjsp;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
    public List<Contact>  contacts = new ArrayList<Contact>();

    public ContactBusiness(List<Contact> contacts) {
        super();
        this.contacts = contacts;
    }
    public ContactBusiness(){
        super();
        init();
    }
    public List<Contact> getContactList() {
        return this.contacts;
    }
    public void init(){
        this.contacts.add(new Contact("d","g","f"));
        this.contacts.add(new Contact("j","h","k"));
        this.contacts.add(new Contact("l","m","n"));
    }

}
