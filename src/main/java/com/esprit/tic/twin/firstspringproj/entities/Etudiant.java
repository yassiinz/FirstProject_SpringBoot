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
public class Etudiant implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @Enumerated(EnumType.STRING)
    private typeEtudiant typeEtudiant;

    private float montantInscription;

    @OneToOne
    private Tache taches;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Tache> tache;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Resevarsion> resevarsion;

    public com.esprit.tic.twin.firstspringproj.entities.typeEtudiant getTypeEtudiant() {
        return typeEtudiant;
    }

    public void setTypeEtudiant(com.esprit.tic.twin.firstspringproj.entities.typeEtudiant typeEtudiant) {
        this.typeEtudiant = typeEtudiant;
    }

    public float getMontantInscription() {
        return montantInscription;
    }

    public void setMontantInscription(float montantInscription) {
        this.montantInscription = montantInscription;
    }

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEt() {
        return nomEt;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public String getPrenomEt() {
        return prenomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Tache getTaches() {
        return taches;
    }

    public void setTaches(Tache taches) {
        this.taches = taches;
    }

    public Set<Tache> getTache() {
        return tache;
    }

    public void setTache(Set<Tache> tache) {
        this.tache = tache;
    }

    public Set<Resevarsion> getResevarsion() {
        return resevarsion;
    }

    public void setResevarsion(Set<Resevarsion> resevarsion) {
        this.resevarsion = resevarsion;
    }
}
