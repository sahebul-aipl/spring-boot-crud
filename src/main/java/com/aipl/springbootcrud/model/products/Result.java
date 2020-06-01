package com.aipl.springbootcrud.model.products;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

private List<ItemDetail> itemDetails = null;
//private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public List<ItemDetail> getItemDetails() {
return itemDetails;
}

public void setItemDetails(List<ItemDetail> itemDetails) {
this.itemDetails = itemDetails;
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