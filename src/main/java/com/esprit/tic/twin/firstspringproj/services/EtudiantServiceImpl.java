package com.esprit.tic.twin.firstspringproj.services;

import com.esprit.tic.twin.firstspringproj.entities.Etudiant;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.Tache;
import com.esprit.tic.twin.firstspringproj.repository.EtudiantRepository;
import com.esprit.tic.twin.firstspringproj.repository.TacheRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    TacheRepository tacheRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) { etudiantRepository.deleteById(idEtudiant);}

    public List<Tache> addTasksAndAffectToEtudiant(List<Tache> taches, String nomEt, String prenomEt) {
        Etudiant etudiant = etudiantRepository.findByNomEtAndPrenomEt(nomEt, prenomEt)
                .orElseThrow(() -> new IllegalArgumentException("Étudiant non trouvé avec le nom et prénom spécifiés."));

        for (Tache tache : taches) {
            tache.setEtudiant(etudiant);
        }

        return tacheRepository.saveAll(taches);
    }
    public HashMap<String, Float> calculNouveauMontantInscriptionDesEtudiants() {
        HashMap<String, Float> result = new HashMap<>();

        List<Etudiant> etudiants = etudiantRepository.findAll();

        for (Etudiant etudiant : etudiants) {
            float montantTaches = 0.0f;
            LocalDate startDate = LocalDate.of(LocalDate.now().getYear(), 9, 1);  // Début de l'année universitaire (par exemple 1er septembre)
            LocalDate endDate = LocalDate.of(LocalDate.now().getYear() + 1, 8, 31);  // Fin de l'année universitaire (31 août)

            for (Tache tache : etudiant.getTache()) {
                if (tache.getDateTache().isAfter(startDate.minusDays(1)) && tache.getDateTache().isBefore(endDate.plusDays(1))) {
                    montantTaches += tache.getTarifHoraire() * tache.getDuree();
                }
            }

            float nouveauMontant = etudiant.getMontantInscription() - montantTaches;

            if (nouveauMontant < 0) {
                nouveauMontant = 0;
            }

            result.put(etudiant.getNomEt() + " " + etudiant.getPrenomEt(), nouveauMontant);
        }

        return result;
    }
}
