package com.example.demo.model;

public record Author(Integer id , String firstName, String lastname) {

    public String fullName(){
        return firstName+" "+lastname;
    }
}
