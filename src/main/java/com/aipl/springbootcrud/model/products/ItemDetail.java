package com.aipl.springbootcrud.model.products;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@IdClass(ItemDetail.class)
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name="productDetails") 
public class ItemDetail implements Serializable{
@Id
@Column	
private String itemCode;
@Id
@Column	
private String itemName;
@Id
@Column	
private String packName;
@Id
@Column	
private String itemCategoryName;
@Id
@Column	
private String mfacName;
@Id
@Column	
private String itemGroupMstName;
@Id
@Column	
private String contentName;
@Id
@Column	
private String diseaseCatName;
@Id
@Column	
private String packTypeName;
@Id
@Column	
private String scheduleName;
@Id
@Column	
private String storageName;
@Id
@Column	
private String storageCareName;
@Id
@Column	
private String brandName;
//private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getItemCode() {
return itemCode;
}

public void setItemCode(String itemCode) {
this.itemCode = itemCode;
}

public String getItemName() {
return itemName;
}

public void setItemName(String itemName) {
this.itemName = itemName;
}

public String getPackName() {
return packName;
}

public void setPackName(String packName) {
this.packName = packName;
}

public String getItemCategoryName() {
return itemCategoryName;
}

public void setItemCategoryName(String itemCategoryName) {
this.itemCategoryName = itemCategoryName;
}

public String getMfacName() {
return mfacName;
}

public void setMfacName(String mfacName) {
this.mfacName = mfacName;
}

public String getItemGroupMstName() {
return itemGroupMstName;
}

public void setItemGroupMstName(String itemGroupMstName) {
this.itemGroupMstName = itemGroupMstName;
}

public String getContentName() {
return contentName;
}

public void setContentName(String contentName) {
this.contentName = contentName;
}

public String getDiseaseCatName() {
return diseaseCatName;
}

public void setDiseaseCatName(String diseaseCatName) {
this.diseaseCatName = diseaseCatName;
}

public String getPackTypeName() {
return packTypeName;
}

public void setPackTypeName(String packTypeName) {
this.packTypeName = packTypeName;
}

public String getScheduleName() {
return scheduleName;
}

public void setScheduleName(String scheduleName) {
this.scheduleName = scheduleName;
}

public String getStorageName() {
return storageName;
}

public void setStorageName(String storageName) {
this.storageName = storageName;
}

public String getStorageCareName() {
return storageCareName;
}

public void setStorageCareName(String storageCareName) {
this.storageCareName = storageCareName;
}

public String getBrandName() {
return brandName;
}

public void setBrandName(String brandName) {
this.brandName = brandName;
}

//public Map<String, Object> getAdditionalProperties() {
//return this.additionalProperties;
//}
//
//public void setAdditionalProperty(String name, Object value) {
//this.additionalProperties.put(name, value);
//}

}