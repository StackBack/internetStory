package com.example.demo.controller;

import com.example.demo.domain.CustomUser;
import com.example.demo.dto.LoginRequestDto;
import com.example.demo.service.AuthService;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private final UserService userService;
    private final AuthService authService;

    @PostMapping("signUp")
    public CustomUser singUp(@RequestBody @Valid CustomUser user){
        return authService.addUser(user);
    }
    @PostMapping("signIn")
    public CustomUser singIn(@RequestBody @Valid LoginRequestDto loginRequestDto){
        return authService.singIn(loginRequestDto);
    }
}
