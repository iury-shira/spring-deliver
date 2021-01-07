package com.springproject.estudo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.estudo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findAllByOrderByNameAsc();

}
