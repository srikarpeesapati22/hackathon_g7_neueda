package com.example.stockapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Stock API", version = "1.0", description = "Stock Information"))
public class StockapiApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockapiApplication.class, args);
    }
}
