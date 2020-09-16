package com.example.demo.service;

import com.example.demo.domain.CustomUser;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {
    private final UserRepository userRepository;

    public CustomUser addUser(CustomUser user) {
        userRepository.save(user);
        return user;
    }

    public CustomUser singIn(CustomUser user){
        return userRepository.findByUserName(user.getUserName());
    }
}
