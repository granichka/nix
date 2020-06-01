package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="usr")
public class User {

    @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String username;
    private String password;
    private String email;


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }




}
