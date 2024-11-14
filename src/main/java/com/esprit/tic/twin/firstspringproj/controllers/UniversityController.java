package com.esprit.tic.twin.firstspringproj.controllers;

import com.esprit.tic.twin.firstspringproj.services.IBlocService;
import com.esprit.tic.twin.firstspringproj.services.IUniversityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/university")
public class UniversityController {
    IUniversityService universityService;
    @PutMapping("/affecterFoyerAuniversity/{idFoyer}/{nomUniversity}")
    @ResponseBody
    public void affecterFoyerAuniversity(@PathVariable("idFoyer") Long idFoyer,@PathVariable("nomUniversity") String nomUniversity ){
        universityService.affecterFoyerAuniversity(idFoyer,nomUniversity);
    }
    @PutMapping("/desaffecterFoyerAUniversite/{idFoyer}")
    @ResponseBody
    public void desaffecterFoyerAUniversite(@PathVariable("idFoyer") Long idFoyer ){
        universityService.desaffecterFoyerAUniversite(idFoyer);
    }
}
