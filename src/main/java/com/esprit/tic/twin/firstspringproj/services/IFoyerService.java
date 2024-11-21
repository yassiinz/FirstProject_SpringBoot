package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    Foyer retrieveFoyer(Long idFoyer);
    void removeFoyer(Long idFoyer);
    Foyer addFoyerWithBloc(Foyer f);
}
