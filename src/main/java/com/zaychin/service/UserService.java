package com.zaychin.service;

import com.zaychin.entity.User;
import com.zaychin.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public record UserService(UserRepository userRepository) {

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
}
