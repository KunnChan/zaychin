package com.zaychin.controller;

import com.zaychin.service.UserService;
import com.zaychin.service.ProductService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/open/customer")
public record CustomerController(UserService userService, ProductService productService) {

    @GetMapping("/home")
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
