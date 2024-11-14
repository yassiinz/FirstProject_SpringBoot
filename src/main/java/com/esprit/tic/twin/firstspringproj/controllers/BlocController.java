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
    @PostMapping("/affectChambers")
    public Bloc affectChambersToBloc(@RequestBody List<Long> numeroChambre, @RequestParam String nomBloc) {
        return blocService.affecterChambresABloc(numeroChambre, nomBloc);
    }

}

