package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.University;

import java.util.List;

public interface IUniversityService {
    List<University> retrieveAllUniversity();
    Foyer addUniversity(University u);
    Foyer updateUniversity(University u);
    Foyer retrieveUniversity(Long idUniversity);
    void removeUniversity(Long idUniversity);
}
