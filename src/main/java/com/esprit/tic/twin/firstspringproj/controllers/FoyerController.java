package com.esprit.tic.twin.firstspringproj.controllers;

import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.University;
import com.esprit.tic.twin.firstspringproj.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/foyers")
public class FoyerController {
    IFoyerService foyerService;
/*    @PostMapping
    public ResponseEntity<Foyer> addFoyerWithBloc(@RequestBody Foyer foyer) {
        Foyer savedFoyer = foyerService.addFoyerWithBloc(foyer);
        return ResponseEntity.ok(savedFoyer);
    }*/
    @PutMapping("/affecterFoyerAUniversite/{idFoyer}/{nomUniversity}")
    @ResponseBody
    public void affecterFoyerAUniversite(@PathVariable("idFoyer") Long idFoyer,@PathVariable("nomUniversity") String nomUniversity){
         foyerService.affecterFoyerAUniversite(idFoyer, nomUniversity);
    }
    @PutMapping("/desaffecterFoyerAUniversite/{idFoyer}")
    @ResponseBody
    public void desaffecterFoyerAUniversite(@PathVariable("idFoyer") Long idFoyer){
        foyerService.desaffecterFoyerAUniversite(idFoyer);
    }

    @PostMapping("/addFoyerWblocs")
    @ResponseBody
    public Foyer addFoyerWithBloc(@RequestBody Foyer foyer){
        return foyerService.addFoyerWithBloc(foyer);
    }

}
