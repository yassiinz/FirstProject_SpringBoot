package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBlocs();
    Bloc addBloc(Bloc b);
    Bloc updateBloc(Bloc b);
    Bloc retrieveBloc(Long idBloc);
    void removeBloc(Long idBloc);
    Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc);
}
