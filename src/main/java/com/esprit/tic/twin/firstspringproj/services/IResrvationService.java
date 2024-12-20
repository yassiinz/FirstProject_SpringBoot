package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Etudiant;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.Resevarsion;

import java.util.Date;
import java.util.List;

public interface IResrvationService {
    List<Resevarsion> retrieveAllResevarsions();
    Resevarsion addResevarsion(Resevarsion r);
    Resevarsion updateResevarsion(Resevarsion r);
    Resevarsion retrieveResevarsion(Long idResevarsion);
    void removeResevarsion(Long idResevarsion);
    Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idResevarsion);
    List<Resevarsion> getReservationParAnneeUniversitaire(Date dateDebut, Date dateFin);
}
