package com.esprit.tic.twin.firstspringproj.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tache implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTache;

    private LocalDate dateTache;

    private Integer duree;

    private Float tarifHoraire;

    @Enumerated(EnumType.STRING)
    private TypeTache typeTache;

    @OneToOne(mappedBy = "taches")
    private Etudiant etudiants;

    @ManyToOne
    Etudiant etudiant;
    // Getters and Setters
    public Long getIdTache() {
        return idTache;
    }

    public void setIdTache(Long idTache) {
        this.idTache = idTache;
    }

    public LocalDate getDateTache() {
        return dateTache;
    }

    public void setDateTache(LocalDate dateTache) {
        this.dateTache = dateTache;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Float getTarifHoraire() {
        return tarifHoraire;
    }

    public void setTarifHoraire(Float tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }

    public TypeTache getTypeTache() {
        return typeTache;
    }

    public void setTypeTache(TypeTache typeTache) {
        this.typeTache = typeTache;
    }

    public Etudiant getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Etudiant etudiants) {
        this.etudiants = etudiants;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
}

