package com.example.Employee_CURD_Swagger_Project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Employee_CURD_Swagger_Project.model.employee;
import com.example.Employee_CURD_Swagger_Project.service.employeeService;

@RestController
@RequestMapping("/employees")
public class employeeController 
{
   @Autowired
    private employeeService service;
    //Create Employee
    @PostMapping
    public employee createEmployee(@RequestBody employee e)
    {
        return service.saveEmployee(e);
    }

    //Get All Employees
    @GetMapping
    public List<employee> getAllEmployees()
    {
        return service.getAllEmployees();
    }
   @GetMapping("/")
public String home() {
    return "API is running";
}
    //Get Employee by ID
    @GetMapping("/{id}")
    public employee getEmployeeById(@PathVariable int id)
    {
        return service.getEmployeeById(id);
    }

    //Update Employee
    @PutMapping("/{id}")
    public employee updateEmployee(@PathVariable int id, @RequestBody employee e)
    {
        return service.updateEmployee(id, e);
    }

    //Delete Employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
        service.deleteEmployee(id);
    }
}
