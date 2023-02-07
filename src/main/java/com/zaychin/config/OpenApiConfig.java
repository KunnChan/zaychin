package com.zaychin.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI(
            @Value("${application.name}") String name,
            @Value("${application.description}") String description,
            @Value("${application.api-version}") String version) {
        return new OpenAPI()
                .info(new Info()
                        .title(name)
                        .version(version)
                        .description(description)
                        .termsOfService("http://zaychin.com/terms/")
                        .license(new License().name("MIT").url("http://mit.org")));
    }
}
