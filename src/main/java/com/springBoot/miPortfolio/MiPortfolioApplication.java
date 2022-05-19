package com.springBoot.miPortfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MiPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPortfolioApplication.class, args);
	}
        
        @Bean
        public WebMvcConfigurer corsConfigurer(){
            return new WebMvcConfigurer(){
                @Override
                public void addCorsMappings(CorsRegistry registry){
                    registry.addMapping("/**").allowedOrigins("https://mi-portfolio-f6a2e.web.app/").allowedHeaders("*").allowedMethods("*");
                    
                }
            };
        }

}
