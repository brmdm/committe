package com.ua.knuca.committee.controller;

import com.ua.knuca.committee.dto.UserDTO.RegisterUserDTO;
import com.ua.knuca.committee.exception.EmailAlreadyExistException;
import com.ua.knuca.committee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Map;

import static com.ua.knuca.committee.controller.EndPoints.LOGIN;
import static com.ua.knuca.committee.controller.EndPoints.REGISTRATION;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping(REGISTRATION)
    public String registrationPage() {
        return REGISTRATION;
    }

    @PostMapping(REGISTRATION)
    public String saveNewUser(@Valid RegisterUserDTO user, Map<String, Object> model) {
        try {
            userService.registerNewUser(user);
        } catch (EmailAlreadyExistException e) {
            model.put("message", e.getMessage());
        }
        return "redirect:" + LOGIN;
    }
}
