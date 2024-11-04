package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.repository.ChambreRepository;
import lombok.AllArgsConstructor;
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
}
