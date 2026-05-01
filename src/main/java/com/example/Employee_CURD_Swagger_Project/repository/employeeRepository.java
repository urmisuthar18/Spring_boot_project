package com.example.Employee_CURD_Swagger_Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Employee_CURD_Swagger_Project.model.employee;

public interface employeeRepository extends JpaRepository<employee, Integer>
{
    
}
