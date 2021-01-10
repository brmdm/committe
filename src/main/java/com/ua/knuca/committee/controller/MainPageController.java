package com.ua.knuca.committee.controller;

import com.ua.knuca.committee.dto.FacultyDTO;
import com.ua.knuca.committee.dto.StatementDTO;
import com.ua.knuca.committee.dto.SubjectDTO;
import com.ua.knuca.committee.dto.UserDTO;
import com.ua.knuca.committee.service.FacultyService;
import com.ua.knuca.committee.service.StatementService;
import com.ua.knuca.committee.service.SubjectService;
import com.ua.knuca.committee.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.Subject;

@RestController
@RequiredArgsConstructor
public class MainPageController {
    private final FacultyService facultyService;
    private final StatementService statementService;
    private final SubjectService subjectService;
    private final UserService userService;

    @GetMapping("/main")
    public ResponseEntity<Page<FacultyDTO>> findAllFaculty(
            @PageableDefault Pageable pageable) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(facultyService.findAll(pageable));
    }

    @GetMapping("/main1")
    public ResponseEntity<Page<StatementDTO>> findAllFaculty1(
            @PageableDefault Pageable pageable) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(statementService.findAll(pageable));
    }

    @GetMapping("/main2")
    public ResponseEntity<Page<SubjectDTO>> findAllFaculty2(
            @PageableDefault Pageable pageable) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(subjectService.findAll(pageable));
    }

    @GetMapping("/main3")
    public ResponseEntity<Page<UserDTO>> findAllFaculty3(
            @PageableDefault Pageable pageable) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userService.findAll(pageable));
    }
}
