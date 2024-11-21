package com.esprit.tic.twin.firstspringproj.controllers;


import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/bloc")
public class BlocController {
    IBlocService blocService;
    @PostMapping("/affectChambers/{nomBloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> numChambre, @PathVariable("nomBloc") String nomBloc) {
        return blocService.affecterChambresABloc(numChambre, nomBloc);
    }


}

