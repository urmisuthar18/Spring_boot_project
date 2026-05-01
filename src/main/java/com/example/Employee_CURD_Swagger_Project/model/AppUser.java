package com.example.Employee_CURD_Swagger_Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AppUser 
{
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    // Getter
    public int getId() 
    {
        return id;
    }

    public String getUsername() 
    {
        return username;
    }

    public String getPassword()     
    {
        return password;
    }

    // Setter
    public void setId(int id) 
    {
        this.id = id;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
}
