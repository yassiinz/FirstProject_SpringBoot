package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.University;
import com.esprit.tic.twin.firstspringproj.repository.FoyerRepository;
import com.esprit.tic.twin.firstspringproj.repository.UniversityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {

    FoyerRepository foyerRepository;
    UniversityRepository universityRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

/*    public Foyer addFoyerWithBloc(Foyer f){
        Set<Bloc> blocs = f.getBloc();
        if (blocs != null) {
            for (Bloc bloc : blocs) {
                bloc.setFoyer(f);
            }
        }
        return foyerRepository.save(f);
    }*/

    @Override
    public Foyer affecterFoyerAUniversite(long idFoyer, String nomUniversite){
        Foyer f = foyerRepository.findById(idFoyer).get();
        University university = universityRepository.findByNomUniversity(nomUniversite);
        f.setUniversity(university);
        return foyerRepository.save(f);
    }
    @Override
    public Foyer desaffecterFoyerAUniversite(long  idFoyer){
        Foyer f = foyerRepository.findById(idFoyer).get();
        f.setUniversity(null);
        return foyerRepository.save(f);
    }
    public Foyer addFoyerWithBloc(Foyer f){
        Set<Bloc> blocs = f.getBloc();
        if (blocs != null){
            for (Bloc bloc : blocs){
                bloc.setFoyer(f);
            }
        }
        Foyer f1 = foyerRepository.save(f);
        return f1;
    }
}
