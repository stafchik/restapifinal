package com.example.restapifinal.controller;

import com.example.restapifinal.model.User;
import com.example.restapifinal.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class RestUserController {
    private final UserService userService;

    public RestUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<User> showUser(Principal principal) {
        return new ResponseEntity<>(userService.findUserByName(principal.getName()), HttpStatus.OK);
    }
}
