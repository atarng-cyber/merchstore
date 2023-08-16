package com.swift.merchstore.controller;

import com.swift.merchstore.dto.user.SignInDto;
import com.swift.merchstore.dto.user.SignInResponseDto;
import com.swift.merchstore.dto.user.SignUpDto;
import com.swift.merchstore.exceptions.AuthenticationFailException;
import com.swift.merchstore.exceptions.CustomException;
import com.swift.merchstore.dto.user.SignUpResponseDto;
import com.swift.merchstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpResponseDto Signup(@RequestBody SignUpDto SignUpDto) throws CustomException {
        return userService.signUp(SignUpDto);
    }

    @PostMapping("/signIn")
    public SignInResponseDto SignIn(@RequestBody SignInDto signInDto) throws CustomException, AuthenticationFailException {
        return userService.signIn(signInDto);
    }

}
