package com.zjh.psstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zjh.psstore.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
}
