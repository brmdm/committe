package com.ua.knuca.committee.controller;

import com.ua.knuca.committee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.ua.knuca.committee.controller.EndPoints.USER_LIST;

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


}