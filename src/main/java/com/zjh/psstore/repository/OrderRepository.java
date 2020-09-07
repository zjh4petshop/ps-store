package com.zjh.psstore.repository;

import com.zjh.psstore.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
