package com.esprit.tic.twin.firstspringproj.controllers;

import com.esprit.tic.twin.firstspringproj.entities.Etudiant;
import com.esprit.tic.twin.firstspringproj.services.IResrvationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/reservations")
public class ReservationController {
    IResrvationService resrvationService;

    @PostMapping("/affecterEtudiant")
    public ResponseEntity<Etudiant> affecterEtudiantAReservation(@RequestBody Map<String, String> requestBody) {
        String nomEt = requestBody.get("nomEt");
        String prenomEt = requestBody.get("prenomEt");
        String idResevarsion = requestBody.get("idResevarsion");

        Etudiant etudiant = resrvationService.affecterEtudiantAReservation(nomEt, prenomEt, idResevarsion);
        return ResponseEntity.ok(etudiant);
    }
}
