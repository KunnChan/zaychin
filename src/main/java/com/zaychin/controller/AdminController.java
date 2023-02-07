package com.zaychin.controller;

import com.zaychin.service.UserService;
import com.zaychin.service.ProductService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SecurityRequirement(name = "bearerAuth")
public record AdminController(UserService userService, ProductService productService) {

    @GetMapping("/hello/index.html")
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
