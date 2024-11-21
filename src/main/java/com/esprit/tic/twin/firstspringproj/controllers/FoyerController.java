package com.esprit.tic.twin.firstspringproj.controllers;

import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/foyers")
public class FoyerController {
    IFoyerService foyerService;
    @PostMapping
    public ResponseEntity<Foyer> addFoyerWithBloc(@RequestBody Foyer foyer) {
        Foyer savedFoyer = foyerService.addFoyerWithBloc(foyer);
        return ResponseEntity.ok(savedFoyer);
    }

}
