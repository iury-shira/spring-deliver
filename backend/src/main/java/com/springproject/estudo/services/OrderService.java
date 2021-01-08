package com.springproject.estudo.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.estudo.dto.OrderDTO;
import com.springproject.estudo.dto.ProductDTO;
import com.springproject.estudo.entities.Order;
import com.springproject.estudo.entities.OrderStatus;
import com.springproject.estudo.entities.Product;
import com.springproject.estudo.repositories.OrderRepository;
import com.springproject.estudo.repositories.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		
		List<Order> list = repository.findOrderWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
		
	}
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public OrderDTO insert (OrderDTO dto) {
		
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), Instant.now(), OrderStatus.PENDING);
		
		for(ProductDTO p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		
		order = repository.save(order);
		return new OrderDTO(order);
	}

}
