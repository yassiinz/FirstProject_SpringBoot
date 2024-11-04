package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.University;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversityServiceImpl implements IUniversityService{
    @Override
    public List<University> retrieveAllUniversity() {
        return null;
    }

    @Override
    public Foyer addUniversity(University u) {
        return null;
    }

    @Override
    public Foyer updateUniversity(University u) {
        return null;
    }

    @Override
    public Foyer retrieveUniversity(Long idUniversity) {
        return null;
    }

    @Override
    public void removeUniversity(Long idUniversity) {

    }
}
