package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.Resevarsion;

import java.util.List;

public interface IResrvationService {
    List<Resevarsion> retrieveAllResevarsions();
    Foyer addResevarsion(Resevarsion r);
    Foyer updateResevarsion(Resevarsion r);
    Foyer retrieveResevarsion(Long idResevarsion);
    void removeResevarsion(Long idResevarsion);
}
