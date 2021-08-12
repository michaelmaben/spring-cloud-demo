package com.jeevanmaben.paymentserviceapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    private Long id;
    private Double amount;
    private String status;
    private Long orderId;
}
