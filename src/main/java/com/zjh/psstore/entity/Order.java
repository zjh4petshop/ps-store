package com.zjh.psstore.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import com.zjh.psstore.enums.OrderStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Document
public class Order extends BaseEntity {

	@NotEmpty
	private String petId;
	@NotNull
	private String userId;
	private Integer quantity;
	private String shipDate;
	private OrderStatus status;
	private Boolean complete;
}
