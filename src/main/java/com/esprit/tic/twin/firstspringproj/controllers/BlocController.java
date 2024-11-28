package com.esprit.tic.twin.firstspringproj.controllers;


import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.TypeChambre;
import com.esprit.tic.twin.firstspringproj.services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/{idBloc}/chambres/count")
    public ResponseEntity<Long> getNbChambreParTypeEtBloc(
            @RequestParam TypeChambre type,
            @PathVariable long idBloc) {

        long count = blocService.nbChambreParTypeEtBloc(type, idBloc);
        return ResponseEntity.ok(count);
    }


}

