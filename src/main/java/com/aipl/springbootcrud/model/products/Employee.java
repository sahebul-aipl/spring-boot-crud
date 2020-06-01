package com.aipl.springbootcrud.model.products;

//import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import java.util.Map;
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

private String status;
private List<EmployeeDetails> data = null;
//private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public List<EmployeeDetails> getData() {
return data;
}

public void setData(List<EmployeeDetails> data) {
this.data = data;
}
//
//public Map<String, Object> getAdditionalProperties() {
//return this.additionalProperties;
//}
//
//public void setAdditionalProperty(String name, Object value) {
//this.additionalProperties.put(name, value);
//}

}