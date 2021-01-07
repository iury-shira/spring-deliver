package com.springproject.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.estudo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
