package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.TypeChambre;

import java.util.List;

public interface IChambreService {
    List<Chamber> retrieveAllChambers();
    Chamber addChamber(Chamber c);
    Chamber updateChamber(Chamber c);
    Chamber retrieveChamber(Long idChamber);
    void removeChamber(Long idChamber);
    List<Chamber> retrieveChambreByBloc(String nomBloc);

    List<Chamber> findChambreByBloc(String nomBloc, TypeChambre typeC);

    List<Chamber> findChambreByReservation(Boolean estValide);

    List<Chamber> findChambreByBlocAndCapacite(String nomBloc, Long capaciteBloc);
}
