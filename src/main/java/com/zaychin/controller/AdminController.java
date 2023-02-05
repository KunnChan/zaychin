package com.zaychin.controller;

import com.zaychin.service.CustomerService;
import com.zaychin.service.ProductService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public record AdminController(CustomerService customerService, ProductService productService) {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin/home")
    public String adminHome() {
       // model.addAttribute("customers", customerService.getAllCustomers());
        return "admin/home";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin/customers")
    public String adminCustomers() {
       // model.addAttribute("customers", customerService.getAllCustomers());
        return "admin/customers";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin/products")
    public String adminProducts() {
        // model.addAttribute("products", productService.getAllProducts());
        return "admin/products";
    }
}
