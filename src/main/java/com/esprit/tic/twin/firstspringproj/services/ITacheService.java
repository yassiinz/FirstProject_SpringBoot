package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.Tache;

import java.util.List;

public interface ITacheService {
    List<Tache> retrieveAllTaches();
    Foyer addTache(Tache t);
    Foyer updateTache(Tache t);
    Foyer retrieveTache(Long idTache);
    void removeTache(Long idTache);
}
