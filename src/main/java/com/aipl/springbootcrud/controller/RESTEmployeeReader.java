package com.aipl.springbootcrud.controller;
import java.util.List;   
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import com.aipl.springbootcrud.model.products.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//@Repository
//@EntityScan
//@EnableJpaRepositories
class RESTEmployeeReader implements ItemReader<Employee> {
 

	  private static final Logger log = LoggerFactory.getLogger(RESTEmployeeReader.class);
    private final String apiUrl;
    private final RestTemplate restTemplate;
 
    private int nextEmployeeIndex;
    private List<Employee> employeeData;
 
    RESTEmployeeReader(String apiUrl, RestTemplate restTemplate) {
        this.apiUrl = apiUrl;
        this.restTemplate = restTemplate;
        nextEmployeeIndex = 0;
    }
 
    @Override
    public Employee read() throws Exception {
    	 System.out.println(":being called");
        if (employeeDataIsNotInitialized()) {
        	employeeData = fetchEmployeeDataFromAPI();
        }
 
        Employee nextEmployee = null;
 
        if (nextEmployeeIndex < employeeData.size()) {
            nextEmployee = employeeData.get(nextEmployeeIndex);
            nextEmployeeIndex++;
        }
 
        return nextEmployee;
    }
 
    private boolean employeeDataIsNotInitialized() {
        return this.employeeData == null;
    }
 
    private List<Employee> fetchEmployeeDataFromAPI() {
        ResponseEntity<Employee[]> response = restTemplate.getForEntity(
            apiUrl, 
            Employee[].class
        );
        Employee[] employeeData = response.getBody();
        log.info("Converting (" + employeeData + ") into");
        System.out.println(employeeData);
        return Arrays.asList(employeeData);
    }
}