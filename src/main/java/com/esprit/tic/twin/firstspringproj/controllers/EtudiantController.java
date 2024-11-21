package com.esprit.tic.twin.firstspringproj.controllers;

import com.esprit.tic.twin.firstspringproj.entities.Etudiant;
import com.esprit.tic.twin.firstspringproj.entities.Tache;
import com.esprit.tic.twin.firstspringproj.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantService.updateEtudiant(e);
        return etudiant;
    }
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }
    @PostMapping("/taches")
    public ResponseEntity<List<Tache>> addTasksAndAffectToEtudiant(
            @RequestBody List<Tache> taches,
            @RequestParam String nom,
            @RequestParam String prenom) {
        List<Tache> savedTaches = etudiantService.addTasksAndAffectToEtudiant(taches, nom, prenom);
        return ResponseEntity.ok(savedTaches);
    }
    @GetMapping("/nouveau-montant-inscription")
    public ResponseEntity<HashMap<String, Float>> getNouveauMontantInscription() {
        HashMap<String, Float> result = etudiantService.calculNouveauMontantInscriptionDesEtudiants();
        return ResponseEntity.ok(result);
    }
}

