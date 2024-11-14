package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.repository.BlocRepository;
import com.esprit.tic.twin.firstspringproj.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
    public Bloc affecterChambresABloc(List<Long> numeroChambre, String nomBloc){
        // Find Bloc by its name
        Bloc bloc = blocRepository.findByNomBloc(nomBloc);

        // Retrieve all Chambers by their numbers
        List<Chamber> chambers = chambreRepository.findByNumeroChambreIn(numeroChambre);

        // Assign Chambers to the Bloc
        bloc.setChamber(chambers);

        // Save and return the updated Bloc
        return blocRepository.save(bloc);
    }

}
