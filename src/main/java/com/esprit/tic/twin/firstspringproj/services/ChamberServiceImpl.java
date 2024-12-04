package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.TypeChambre;
import com.esprit.tic.twin.firstspringproj.repository.BlocRepository;
import com.esprit.tic.twin.firstspringproj.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
@Slf4j
public class ChamberServiceImpl implements IChambreService{
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;
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
    public List<Chamber> findChambreByBlocAndTypechambre(String nomBloc, TypeChambre typeC) {
        return chambreRepository.findChambreByBlocAndTypechambre(nomBloc, typeC);
    }

    @Override
    public List<Chamber> findChambreByReservation(Boolean estValide) {
        return chambreRepository.findChambreByReservation(estValide);
    }

    @Override
    public List<Chamber> findChambreByBlocAndCapacite(String nomBloc, Long capaciteBloc) {
        return chambreRepository.findChambreByBlocAndCapacite(nomBloc, capaciteBloc);
    }
    @Scheduled(cron = "*/59 * * * * * ")
    public void listeChambresParBloc(){
        List<Bloc> blocs = blocRepository.findAll();
        for (Bloc bloc : blocs) {
            log.info("bloc : " + bloc.getNomBloc() + " ayant une capacité de : " + bloc.getCapaciteBloc());
            log.info("Liste des chambres du bloc " + bloc.getNomBloc());
            List<Chamber> chambers = retrieveChambreByBloc(bloc.getNomBloc());
            for (Chamber chamber : chambers) {
                log.info("chambre numéro "+chamber.getNumeroChambre()+" de type "+chamber.getTypeC());
            }

        }
    }

/*    @Scheduled(fixedRate = 60000)
    public void listeChambresParBloc(){

        List<Bloc> listB = blocRepository.findAll();
        for (Bloc bloc : listB) {
            log.info("Bloc : " + bloc.getNomBloc() + " ayant une capacité de " + bloc.getCapaciteBloc());
            log.info("Liste des chambres du bloc " + bloc.getNomBloc() + " :");
            for (Chamber ch : bloc.getChamber()){
                log.info("Chambre numéro " + ch.getNumeroChambre() + " de type " + ch.getTypeC());
            }
        }}*/
    /*@Scheduled()
    public void pourcentageChambreParTypeChambre(){
        Integer listC = chambreRepository.findAll().size();
        Arrays.stream(TypeChambre.values()).forEach(
                typeChambre -> {
                    Integer nbChambresParType = chambreRepository
                }
        );

    }*/

}
