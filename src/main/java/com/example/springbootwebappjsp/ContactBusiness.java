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
        this.contacts.add(new Contact("Marry John","marry.john@gmail.com","USA"));
        this.contacts.add(new Contact("Ja John","Ja.john@gmail.com","Th"));
        this.contacts.add(new Contact("Roger Jenny","roger.jenny@gmail.com","Eng"));
        this.contacts.add(new Contact("Meechai Sara","Meechai.sara.@gmail.com","IND"));
        this.contacts.add(new Contact("Bob Matin","Bob.Matin@gmail.com","Australia"));
    }

}
