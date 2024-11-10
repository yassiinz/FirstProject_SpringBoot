package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.TypeChambre;
import com.esprit.tic.twin.firstspringproj.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChamberServiceImpl implements IChambreService{
    ChambreRepository chambreRepository;
    @Override
    public List<Chamber> retrieveAllChambers() {
        return chambreRepository.findAll();
    }

    @Override
    public Chamber addChamber(Chamber c) { return chambreRepository.save(c);}

    @Override
    public Chamber updateChamber(Chamber c) {return chambreRepository.save(c);}

    @Override
    public Chamber retrieveChamber(Long idChamber) { return chambreRepository.findById(idChamber).get(); }

    @Override
    public void removeChamber(Long idChamber) { chambreRepository.deleteById(idChamber);}

    @Override
    public List<Chamber> retrieveChambreByBloc(String nomBloc) {
        return chambreRepository.retrieveChambreByBloc(nomBloc);
    }

    @Override
    public List<Chamber> findChambreByBloc(String nomBloc, TypeChambre typeC) {
        return chambreRepository.findChambreByBloc(nomBloc, typeC);
    }

    @Override
    public List<Chamber> findChambreByReservation(Boolean estValide) {
        return chambreRepository.findChambreByReservation(estValide);
    }

    @Override
    public List<Chamber> findChambreByBlocAndCapacite(String nomBloc, Long capaciteBloc) {
        return chambreRepository.findChambreByBlocAndCapacite(nomBloc, capaciteBloc);
    }

}
