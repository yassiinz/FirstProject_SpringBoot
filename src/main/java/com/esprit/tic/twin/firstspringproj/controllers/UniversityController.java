package com.esprit.tic.twin.firstspringproj.controllers;

import com.esprit.tic.twin.firstspringproj.services.IBlocService;
import com.esprit.tic.twin.firstspringproj.services.IUniversityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UniversityController {
    IUniversityService universityService;
}
