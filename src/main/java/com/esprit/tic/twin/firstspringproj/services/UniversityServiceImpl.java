package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.University;
import com.esprit.tic.twin.firstspringproj.repository.FoyerRepository;
import com.esprit.tic.twin.firstspringproj.repository.UniversityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversityServiceImpl implements IUniversityService{
    UniversityRepository universityRepository;
    FoyerRepository foyerRepository;
    @Override
    public List<University> retrieveAllUniversity() {
        return null;
    }

    @Override
    public University addUniversity(University u) {
        return null;
    }

    @Override
    public University updateUniversity(University u) {
        return null;
    }

    @Override
    public University retrieveUniversity(Long idUniversity) {
        return null;
    }

    @Override
    public void removeUniversity(Long idUniversity) {

    }
    @Override
    public University affecterFoyerAuniversity(Long idfoyer,String nomUniversite){
        Foyer foyer = foyerRepository.findById(idfoyer).get();
        University uni = universityRepository.findByNomUniversity(nomUniversite);
        foyer.setUniversity(uni);
        foyerRepository.save(foyer);
        return uni;
    }
    @Override
    public University desaffecterFoyerAUniversite (long idFoyer){
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        foyer.setUniversity(null);
        foyerRepository.save(foyer);
        return null;
    }
}
