package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Etudiant;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Foyer addEtudiant(Etudiant e);
    Foyer updateEtudiant(Etudiant e);
    Foyer retrieveEtudiant(Long idEtudiant);
    void removeEtudiant(Long idEtudiant);
}
