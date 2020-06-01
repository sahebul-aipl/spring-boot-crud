package com.aipl.springbootcrud.controller;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  

import java.util.ArrayList;
import com.aipl.springbootcrud.model.products.*;
import com.aipl.springbootcrud.service.EmployeeService;
import com.aipl.springbootcrud.service.ParsingService;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.aipl.springbootcrud.controller.RESTEmployeeReader;
@RestController  
@RequestMapping("/employee")
public class EmployeeController {
	private Employee employeeData;
	private ArrayList<EmployeeDetails> employeeDetails;
	private static String message="Operation success";
	private static final String url="http://dummy.restapiexample.com/api/v1/employees";
	
	@Autowired
	private ParsingService parsingService;
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping(value = "/list")
	public String getEmployeeList() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			employeeData =mapper.convertValue(parsingService.parse(url), Employee.class);
			employeeDetails=(ArrayList<EmployeeDetails>) employeeData.getData();
			if(employeeData.getStatus().equalsIgnoreCase("success")) {
				if(employeeDetails.size()>0) {
					for(int i=0;i<employeeDetails.size(); i++) {
						if(employeeDetails.get(i) != null) {
							employeeService.saveEmployee(employeeDetails.get(i));
//							System.out.print(employeeDetails.get(i).getEmployee_name());
						}
						
					}
				}
				
			}else {
				message="No Data Found. Operation failed.";
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			message=e.getMessage();
		}
		
		
		return message;
	   } 
	
}
