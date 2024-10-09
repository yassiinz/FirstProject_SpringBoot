package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;

import java.util.List;

public interface IChambreService {
    List<Chamber> retrieveAllChambers();
    Foyer addChamber(Chamber c);
    Foyer updateChamber(Chamber c);
    Foyer retrieveChamber(Long idChamber);
    void removeChamber(Long idChamber);
}
