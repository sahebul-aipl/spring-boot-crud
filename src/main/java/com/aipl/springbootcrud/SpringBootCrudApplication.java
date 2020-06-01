package com.aipl.springbootcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.aipl.springbootcrud"})



public class SpringBootCrudApplication {
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}
	

}
