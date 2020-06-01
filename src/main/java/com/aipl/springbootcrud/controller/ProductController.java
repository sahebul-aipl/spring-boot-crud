package com.aipl.springbootcrud.controller; 
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  

import java.util.ArrayList;
import com.aipl.springbootcrud.model.products.*;
import com.aipl.springbootcrud.service.ParsingService;
import com.aipl.springbootcrud.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController  
@RequestMapping("/products")
public class ProductController {
	public String message="Operation succesfull";
	private Products productsData;
	private ArrayList<ItemDetail> items;
	private static final String lifecareurl="http://180.151.8.186:20000/ws_egservice_057_get_all_trans_data?cindex=item_details&fromDate=2020-01-01&toDate=2020-01-02http://180.151.8.186:20000/ws_egservice_057_get_all_trans_data?cindex=purchase_details&fromDate=2020-01-01&toDate=2020-01-02";
	@Autowired
//	RestTemplate restTemplate;
	private ParsingService parsingService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/syncProducts")
	public String syncProducts() {
		ObjectMapper mapper = new ObjectMapper();
		productsData =mapper.convertValue(parsingService.parse(lifecareurl), Products.class);
		try {
			items=(ArrayList<ItemDetail>) productsData.getResponse().getResult().getItemDetails();
			for(int i=0;i<items.size(); i++) {
				if(items.get(i) != null) {
					productService.saveProduct(items.get(i));
				}
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			message=e.getMessage().toString();
		}
		
		
		return message;
	}
}
