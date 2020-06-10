package com.example.demoshardingsphere.infrastructure.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem implements Serializable {
    private Long orderItemId;

    private Long orderId;

    private Integer userId;

    private String status;
}
