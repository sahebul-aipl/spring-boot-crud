package com.aipl.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.aipl.springbootcrud.model.products.EmployeeDetails;

public interface EmployeeRepository extends CrudRepository<EmployeeDetails, String>{

}

