package com.esprit.tic.twin.firstspringproj.repository;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoyerRepository extends JpaRepository<Foyer,long>{
    List<Foyer> findByUniversiteNomUniversite(String nomFoyer);
    List<Foyer> findByBlocsNomBloc(String s);
    List<Foyer> findByUniversiteNomUniversiteAndBlocsNomBloc(String nomFoyer);

}
