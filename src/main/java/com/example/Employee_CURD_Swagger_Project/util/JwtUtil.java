package com.example.Employee_CURD_Swagger_Project.util;

import java.security.Key;
import java.sql.Date;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil 
{
    private final String SECERT = "mysecretkey_mysecretkey_mysecretkey";

    private Key getKey()
    {
        return Keys.hmacShaKeyFor(SECERT.getBytes());
    }

    public String generateToken(String username)
    {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(0)) //optional 
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) //optional
                // Token valid for 10 hours
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }  
    
    public String extractUsername(String token)
    {
        return Jwts.parserBuilder()
                .setSigningKey(getKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
