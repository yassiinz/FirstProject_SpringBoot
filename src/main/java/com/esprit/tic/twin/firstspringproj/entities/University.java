package com.esprit.tic.twin.firstspringproj.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class University implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUniversity")
    private long idUniversity;
    private String nomUniversity;
    private String adresse;

    @OneToOne(mappedBy="university")
    private Foyer foyer;

    public long getIdUniversity() {
        return idUniversity;
    }

    public void setIdUniversity(long idUniversity) {
        this.idUniversity = idUniversity;
    }

    public String getNomUniversity() {
        return nomUniversity;
    }

    public void setNomUniversity(String nomUniversity) {
        this.nomUniversity = nomUniversity;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
}
