package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.Tache;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TacheServiceImpl implements ITacheService{
    @Override
    public List<Tache> retrieveAllTaches() {
        return null;
    }

    @Override
    public Foyer addTache(Tache t) {
        return null;
    }

    @Override
    public Foyer updateTache(Tache t) {
        return null;
    }

    @Override
    public Foyer retrieveTache(Long idTache) {
        return null;
    }

    @Override
    public void removeTache(Long idTache) {

    }
}
