package com.ua.knuca.committee.controller;

import com.ua.knuca.committee.entity.UserEntity;
import com.ua.knuca.committee.service.FacultyService;
import com.ua.knuca.committee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.ua.knuca.committee.controller.EndPoints.MAIN_PAGE;
import static com.ua.knuca.committee.controller.EndPoints.OFFICE;

@Controller
@RequiredArgsConstructor
public class MainPageController {
    private final FacultyService facultyService;
    private final UserService userService;

    @GetMapping(MAIN_PAGE)
    public String mainPage(
            Model model,
            @PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC) Pageable pageable) {
        model.addAttribute("page", facultyService.findAll(pageable));
        model.addAttribute("url", "");
        return "main";
    }

    @GetMapping(OFFICE)
    public String office(Model model,
            @AuthenticationPrincipal UserEntity user) {
        model.addAttribute("statements", userService.findAllStatementsByUserId(user.getId()));;
        return "office";
    }
}
