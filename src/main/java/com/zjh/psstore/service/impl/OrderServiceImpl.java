package com.zjh.psstore.service.impl;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zjh.psstore.entity.Order;
import com.zjh.psstore.repository.OrderRepository;
import com.zjh.psstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private OrderRepository orderRepository;

	@Value("${apps.pet.url.getById}")
	private String petGetByIdUrl;

	@Override
	public Order createNewOrder(Order order) {
		String petId = order.getPetId();
		ResponseEntity<Void> responseEntity = restTemplate.getForEntity(petGetByIdUrl, Void.class, petId);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			Order newOrder = orderRepository.save(order);
			return newOrder;
		}
		throw new EntityNotFoundException("Pet id: " + petId + " not found");
	}

	@Override
	public boolean checkPetIdExists(String petId) {
		ResponseEntity<Void> responseEntity = restTemplate.getForEntity(petGetByIdUrl, Void.class, petId);
		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			return true;
		}
		return false;
	}
}
