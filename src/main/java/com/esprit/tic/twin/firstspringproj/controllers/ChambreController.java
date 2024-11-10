package com.esprit.tic.twin.firstspringproj.controllers;

import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.entities.TypeChambre;
import com.esprit.tic.twin.firstspringproj.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chambers") // Chemin de base pour l'API
@AllArgsConstructor
public class ChambreController {

    IChambreService chambreService;

    @GetMapping("/bloc/{nomBloc}")
    public ResponseEntity<List<Chamber>> retrieveChambreByBloc(@PathVariable String nomBloc) {
        List<Chamber> chambers = chambreService.retrieveChambreByBloc(nomBloc);
        return ResponseEntity.ok(chambers);
    }

    @GetMapping("/bloc/{nomBloc}/type/{typeC}")
    public ResponseEntity<List<Chamber>> findChambreByBlocAndType(
            @PathVariable String nomBloc,
            @PathVariable TypeChambre typeC) {
        List<Chamber> chambers = chambreService.findChambreByBloc(nomBloc, typeC);
        return ResponseEntity.ok(chambers);
    }

    @GetMapping("/reservation/valide/{estValide}")
    public ResponseEntity<List<Chamber>> findChambreByReservation(@PathVariable Boolean estValide) {
        List<Chamber> chambers = chambreService.findChambreByReservation(estValide);
        return ResponseEntity.ok(chambers);
    }

    @GetMapping("/bloc/{nomBloc}/capacite/{capaciteBloc}")
    public ResponseEntity<List<Chamber>> findChambreByBlocAndCapacite(
            @PathVariable String nomBloc,
            @PathVariable Long capaciteBloc) {
        List<Chamber> chambers = chambreService.findChambreByBlocAndCapacite(nomBloc, capaciteBloc);
        return ResponseEntity.ok(chambers);
    }
}
