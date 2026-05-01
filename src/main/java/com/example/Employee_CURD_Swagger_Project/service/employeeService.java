package com.example.Employee_CURD_Swagger_Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Employee_CURD_Swagger_Project.model.employee;
import com.example.Employee_CURD_Swagger_Project.repository.employeeRepository;

@Service
public class employeeService 
{
    @Autowired
    private employeeRepository repo;

    public employee saveEmployee(employee e)
    {
        return repo.save(e);
    }

    public List<employee> getAllEmployees()
    {
        return repo.findAll();
    }

    public employee getEmployeeById(int id)
    {
        return repo.findById(id).orElse(null);
    }

    public employee updateEmployee(int id, employee e)
    {
        employee existingEmployee = repo.findById(id).orElse(null);
        if (existingEmployee != null)
        {
            existingEmployee.setName(e.getName());
            existingEmployee.setSalary(e.getSalary());
            existingEmployee.setDepartment(e.getDepartment());
            return repo.save(existingEmployee);
        }
        return null;
    }

    public void deleteEmployee(int id)
    {
        repo.deleteById(id);
    }
}
