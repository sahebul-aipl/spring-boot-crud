package com.aipl.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.aipl.springbootcrud.model.products.ItemDetail;

public interface ProductRepository extends CrudRepository<ItemDetail, String> {

}
