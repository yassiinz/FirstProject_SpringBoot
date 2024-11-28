package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Etudiant;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.Resevarsion;
import com.esprit.tic.twin.firstspringproj.repository.EtudiantRepository;
import com.esprit.tic.twin.firstspringproj.repository.ReservationRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IResrvationService{
    EtudiantRepository etudiantRepository;
    ReservationRepository reservationRepository;
    @Override
    public List<Resevarsion> retrieveAllResevarsions() {
        return null;
    }

    @Override
    public Resevarsion addResevarsion(Resevarsion r) {
        return null;
    }

    @Override
    public Resevarsion updateResevarsion(Resevarsion r) {
        return null;
    }

    @Override
    public Resevarsion retrieveResevarsion(Long idResevarsion) {
        return null;
    }

    @Override
    public void removeResevarsion(Long idResevarsion) {
    }
    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idResevarsion) {
        Etudiant etudiant = etudiantRepository.findByNomEtAndPrenomEt(nomEt, prenomEt)
                .orElseThrow(() -> new EntityNotFoundException("Étudiant non trouvé"));


        Resevarsion resevarsion = reservationRepository.findById(Long.valueOf(idResevarsion))
                .orElseThrow(() -> new EntityNotFoundException("Réservation non trouvée"));


        resevarsion.getEtudiant().add(etudiant);


        etudiant.getResevarsion().add(resevarsion);

        reservationRepository.save(resevarsion);
        etudiantRepository.save(etudiant);

        return etudiant;
    }
    @Override
    public List<Resevarsion> getReservationParAnneeUniversitaire(Date dateDebut, Date dateFin) {
        if (dateDebut == null || dateFin == null) {
            throw new IllegalArgumentException("Les dates ne peuvent pas être nulles");
        }
        return reservationRepository.findReservationsBetweenDates(dateDebut, dateFin);
    }
}
