package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.University;

import java.util.List;

public interface IUniversityService {
    List<University> retrieveAllUniversity();
    University addUniversity(University u);
    University updateUniversity(University u);
    University retrieveUniversity(Long idUniversity);
    void removeUniversity(Long idUniversity);
    University affecterFoyerAuniversity(Long idfoyer,String nomUniversite);
    University desaffecterFoyerAUniversite (long idFoyer);
}
