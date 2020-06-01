package com.aipl.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aipl.springbootcrud.model.products.ItemDetail;
import com.aipl.springbootcrud.repository.ProductRepository;
@Service  
public class ProductService {
	
@Autowired 
ProductRepository productRepository;

public void saveProduct(ItemDetail item) {
	productRepository.save(item);
}

}
