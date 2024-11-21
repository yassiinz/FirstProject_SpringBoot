package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.repository.BlocRepository;
import com.esprit.tic.twin.firstspringproj.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{

    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc){
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);

        numChambre.stream().forEach(
            chamberNumber -> {
            Chamber c = chambreRepository.findByNumeroChambre(chamberNumber);
            c.setBloc(bloc);
            chambreRepository.save(c);
        });

        return bloc;
    }
    }

