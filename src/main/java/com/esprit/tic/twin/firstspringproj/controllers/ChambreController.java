package com.esprit.tic.twin.firstspringproj.controllers;

import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.entities.Etudiant;
import com.esprit.tic.twin.firstspringproj.entities.TypeChambre;
import com.esprit.tic.twin.firstspringproj.services.IChambreService;
import com.esprit.tic.twin.firstspringproj.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chambers")
@AllArgsConstructor
public class ChambreController {

    IChambreService chambreService;
    @GetMapping("/retrieve-all-Chambres")
    public List<Chamber> getChamber() {
        List<Chamber> listChambres = chambreService.retrieveAllChambers();
        return listChambres;
    }
    @PostMapping("/add-Chambre")
    public Chamber addChamre(@RequestBody Chamber e) {
        Chamber Chamber = chambreService.addChamber(e);
        return Chamber;
    }
    @PutMapping("/update-Chambre")
    public Chamber updateEtudiant(@RequestBody Chamber e) {
        Chamber Chamber= chambreService.updateChamber(e);
        return Chamber;
    }
    @DeleteMapping("/remove-Chambre/{idChambre}")
    public void removeChambre(@PathVariable("idChambre") Long idChambre) {
        chambreService.removeChamber(idChambre);
    }

    @GetMapping("/bloc/{nomBloc}")
    public ResponseEntity<List<Chamber>> retrieveChambreByBloc(@PathVariable String nomBloc) {
        List<Chamber> chambers = chambreService.retrieveChambreByBloc(nomBloc);
        return ResponseEntity.ok(chambers);
    }


    @GetMapping("/bloc/{nomBloc}/type/{typeC}")
    public ResponseEntity<List<Chamber>> findChambreByBlocAndType(
            @PathVariable String nomBloc,
            @PathVariable TypeChambre typeC) {
        List<Chamber> chambers = chambreService.findChambreByBlocAndTypechambre(nomBloc, typeC);
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
