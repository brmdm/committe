package com.ua.knuca.committee.controller;

import com.ua.knuca.committee.dto.FacultyDTO.FacultyDTO;
import com.ua.knuca.committee.service.FacultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.ua.knuca.committee.controller.EndPoints.*;

@Controller
@RequestMapping(FACULTY)
@RequiredArgsConstructor
public class FacultyController {
    private final FacultyService facultyService;

    @GetMapping(FIND_BY_ID)
    public String facultyPage(@PathVariable Integer id, Model model) {
        model.addAttribute("faculty", facultyService.findFacultyById(id));
        return "faculty";
    }

    @GetMapping(DELETE)
    public String deleteFaculty(@RequestParam Integer facultyId, Model model) {
        facultyService.deleteFacultyById(facultyId);
        return "redirect:" + MAIN_PAGE;
    }

    @GetMapping
    public String addNewFaculty() {
        return "newfaculty";
    }

    @PostMapping
    public String newFaculty(@Valid FacultyDTO facultyDTO, Model model) {
        Integer facultyId = facultyService.saveNewFaculty(facultyDTO).getId();
        return "redirect:" + FACULTY + "/" + facultyId;
    }
}
