package com.ecommerce.Product_service.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI(
        ).info(new Info()
                .title("Product Service")
                .description("This is the product service")
                .version("1.0")
        );
    }
}
