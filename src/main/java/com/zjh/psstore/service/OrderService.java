package com.zjh.psstore.service;

import com.zjh.psstore.entity.Order;

public interface OrderService {

	Order createNewOrder(Order order);

	boolean checkPetIdExists(String petId);
}
