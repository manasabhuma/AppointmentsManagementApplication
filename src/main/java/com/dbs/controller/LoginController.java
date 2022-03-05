package com.dbs.controller;

import com.dbs.models.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity login(@Valid @RequestBody LoginRequest request) {
        return ResponseEntity.accepted().build();
    }
}
