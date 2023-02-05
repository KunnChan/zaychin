package com.zaychin.controller;

import com.zaychin.service.CustomerService;
import com.zaychin.service.ProductService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public record CustomerController(CustomerService customerService, ProductService productService) {

    @PreAuthorize("hasRole('CUSTOMER')")
    @GetMapping("/customer/home")
    public String customerHome() {
        // model.addAttribute("products", productService.getAllProducts());
        return "customer/home";
    }

    @PreAuthorize("hasRole('CUSTOMER')")
    @GetMapping("/customer/profile")
    public String customerProfile() {
       // model.addAttribute("customer", customerService.getCurrentCustomer());
        return "customer/profile";
    }

    @PreAuthorize("hasRole('CUSTOMER')")
    @PostMapping("/customer/update")
    public String updateCustomerProfile() {
        //customerService.updateCustomer(customer);
        return "redirect:/customer/profile";
    }
}
