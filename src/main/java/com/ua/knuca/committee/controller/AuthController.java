package com.ua.knuca.committee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.ua.knuca.committee.controller.EndPoints.REGISTRATION;

@Controller
@RequestMapping
public class AuthController {

    @GetMapping(REGISTRATION)
    public String registrationPage() {
        return REGISTRATION;
    }

    @PostMapping(REGISTRATION)
    public String saveNewUser() {
        return "";
    }
}
