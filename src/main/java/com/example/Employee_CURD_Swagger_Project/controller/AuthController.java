package com.example.Employee_CURD_Swagger_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Employee_CURD_Swagger_Project.model.AppUser;
import com.example.Employee_CURD_Swagger_Project.util.JwtUtil;


@RestController
@RequestMapping("/auth")
public class AuthController 
{
    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody AppUser user)
    {
        if ("admin".equals(user.getUsername()) && "1234".equals(user.getPassword())) 
        {
            return jwtUtil.generateToken(user.getUsername());
        }
        else 
        {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
