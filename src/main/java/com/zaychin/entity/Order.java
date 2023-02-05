package com.zaychin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private int orderId;
    private int customerId;
    private Date orderDate;
    private double totalPrice;
    private String deliveryAddress;
    private String deliveryCity;
    private String deliveryPostcode;
    private String deliveryCountry;
}
