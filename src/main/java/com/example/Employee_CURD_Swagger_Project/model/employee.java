package com.example.Employee_CURD_Swagger_Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class employee 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String department;
    private double salary;

    //Getter 
    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public String getDepartment() 
    {
        return department;
    }

    public double getSalary() 
    {
        return salary;
    }

    //Setter
    public void setId(int id) 
    {
        this.id = id;
    }   

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setDepartment(String department) 
    {
        this.department = department;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    } 
}
