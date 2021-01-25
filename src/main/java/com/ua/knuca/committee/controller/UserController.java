package com.ua.knuca.committee.controller;

import com.ua.knuca.committee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.ua.knuca.committee.controller.EndPoints.*;

@Controller
@RequestMapping(USER_LIST)
@PreAuthorize("hasAuthority('ADMIN')")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public String userList (Model model) {
        model.addAttribute("users", userService.findAll());
        return "userList";
    }

    @GetMapping(USER_DISABLE)
    public String disableUser (Model model, @RequestParam Integer userId) {
        userService.setEnableForUserById(userId, false);
        model.addAttribute("users", userService.findAll());
        return "userList";
    }

    @GetMapping(USER_ENABLE)
    public String enableUser (Model model, @RequestParam Integer userId) {
        userService.setEnableForUserById(userId, true);
        model.addAttribute("users", userService.findAll());
        return "userList";
    }
}