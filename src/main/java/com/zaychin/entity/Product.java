package com.zaychin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    private int productId;
    private String name;
    private String description;
    private double price;
    private String image;
}
