package com.aipl.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aipl.springbootcrud.model.products.EmployeeDetails;
import com.aipl.springbootcrud.model.products.ItemDetail;
import com.aipl.springbootcrud.repository.EmployeeRepository;
@Service  
public class EmployeeService {
	
@Autowired 
EmployeeRepository employeeRepository;

public void saveEmployee(EmployeeDetails emp) {
	employeeRepository.save(emp);
}

}
