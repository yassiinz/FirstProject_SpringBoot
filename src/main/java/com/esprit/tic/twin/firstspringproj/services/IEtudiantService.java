package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Etudiant;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.Tache;

import java.util.HashMap;
import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Long idEtudiant);
    void removeEtudiant(Long idEtudiant);
    List<Tache> addTasksAndAffectToEtudiant (List<Tache> tasks, String nomEt, String prenomEt );
    HashMap<String,Float> calculNouveauMontantInscriptionDesEtudiants() ;

}
