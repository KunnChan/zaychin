package com.zaychin.service;

import com.zaychin.entity.Customer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final CustomerService customerService;

    public UserDetailsServiceImpl(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer = customerService.getCustomerByUsername(username);
        if (customer == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }
        String roles = "ADMIN";
        return User.builder()
                .username(customer.getUsername())
                .password(customer.getPassword())
                .roles(roles)
                .build();
    }
}
