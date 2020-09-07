package com.zjh.psstore.entity;

import com.zjh.psstore.enums.OrderStatus;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
public class Order extends BaseEntity{

    @NotEmpty
    private List<String> petIds;
    @NotNull
    private String userId;
    private Integer quantity;
    private String shipDate;
    private OrderStatus status;
    private Boolean complete;
}
