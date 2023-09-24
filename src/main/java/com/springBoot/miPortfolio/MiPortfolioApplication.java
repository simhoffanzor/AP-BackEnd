package com.springBoot.miPortfolio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MiPortfolioApplication {

    @Value("${miportfolio.web.origins}")
    private String[] allowedOrigins;

	public static void main(String[] args) {
		SpringApplication.run(MiPortfolioApplication.class, args);
	}
        
    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer(){
            @Override
            public void addCorsMappings(CorsRegistry registry){
                CorsRegistration corsRegistration = registry.addMapping("/**").allowedHeaders("*").allowedMethods("*");

                for (String origin : allowedOrigins) {
                    corsRegistration.allowedOrigins(origin);
                }
            }
        };
    }

}
