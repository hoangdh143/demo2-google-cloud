package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name= "user_contact")
public class UserContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    public UserContact(String username) {
        this.username = username;
    }

    public UserContact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}