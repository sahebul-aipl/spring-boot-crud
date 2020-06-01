package com.aipl.springbootcrud.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.aipl.springbootcrud.model.products.Employee;
import org.springframework.batch.item.ItemReader;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;
@Configuration
public class EmployeeJobConfig {
	@Bean
    ItemReader<Employee> restEmployeeReader(Environment environment, 
                                             RestTemplate restTemplate) {
        return new RESTEmployeeReader(
            "http://dummy.restapiexample.com/api/v1/employees", 
            restTemplate
        );
    }
}
