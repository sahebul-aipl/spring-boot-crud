package com.aipl.springbootcrud.repository;
import org.springframework.data.repository.CrudRepository;  
import com.aipl.springbootcrud.model.Books;  
public interface BooksRepository extends CrudRepository<Books,Integer>{

}
