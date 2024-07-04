package com.example.springbootwebappjsp;

public class Contact {
    private String name;
    private String email;
    private String country;

    public Contact() {
    }
    public Contact(String email, String name, String country) {
        this.email = email;
        this.name = name;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }


}

