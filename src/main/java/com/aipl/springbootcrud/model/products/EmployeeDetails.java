package com.aipl.springbootcrud.model.products;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@IdClass(EmployeeDetails.class)
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name="EmployeeDetails")  
public class EmployeeDetails implements Serializable{


public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public String getEmployee_salary() {
	return employee_salary;
}
public void setEmployee_salary(String employee_salary) {
	this.employee_salary = employee_salary;
}
public String getEmployee_age() {
	return employee_age;
}
public void setEmployee_age(String employee_age) {
	this.employee_age = employee_age;
}
public String getProfile_image() {
	return profile_image;
}
public void setProfile_image(String profile_image) {
	this.profile_image = "default";
}
@Id
@Column	
private String id;
@Id
@Column
private String employee_name;
@Id
@Column
private String employee_salary;
@Id
@Column
private String employee_age;
@Id
@Column
private String profile_image;
//private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}