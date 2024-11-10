package com.esprit.tic.twin.firstspringproj.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Resevarsion implements Serializable{
    @Id
    @Column(name="idResevarsion")
    private String idResevarsion;
    @Temporal(TemporalType.DATE)
    private Date anneUniversitaire;
    private boolean estValide;

    @ManyToMany(mappedBy="resevarsion", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiant;
    public String getIdResevarsion() {
        return idResevarsion;
    }

    public void setIdResevarsion(String idResevarsion) {
        this.idResevarsion = idResevarsion;
    }

    public Date getAnneUniversitaire() {
        return anneUniversitaire;
    }

    public void setAnneUniversitaire(Date anneUniversitaire) {
        this.anneUniversitaire = anneUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }

}
