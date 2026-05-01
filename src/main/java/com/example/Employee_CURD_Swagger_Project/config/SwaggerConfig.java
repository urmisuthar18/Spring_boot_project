package com.example.Employee_CURD_Swagger_Project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

//Employee CURD Swagger Project

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() 
    {
        /*return new OpenAPI()
                .info(new Info()
                        .title("Employee CURD API")
                        .version("1.0")
                        .description("API for managing employee records"));
    }*/
        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement().addList("BearerAuth"))
                .components(new Components()
                        .addSecuritySchemes("BearerAuth",
                                new SecurityScheme()
                                        .name("Authorization")
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                        )
                );
    
    }
}
