package com.example.demo.service;

import com.example.demo.domain.CustomUser;
import com.example.demo.dto.LoginRequestDto;
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

    public CustomUser singIn(LoginRequestDto loginRequestDto){
        return userRepository.findByUserName(loginRequestDto.getUserName());
    }
}
