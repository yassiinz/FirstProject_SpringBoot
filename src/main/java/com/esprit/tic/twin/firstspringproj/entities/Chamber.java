package com.esprit.tic.twin.firstspringproj.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Chamber implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING) // Store the enum as a string in the database
    private TypeChambre typeC;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Resevarsion> resevarsion;

    @ManyToOne
    Bloc bloc;

    // Getters and Setters
    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
}

