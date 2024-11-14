    package com.esprit.tic.twin.firstspringproj.entities;
    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import java.io.Serializable;
    import java.util.Set;

    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Chamber implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idChambre;

        private Long numeroChambre;

        @Enumerated(EnumType.STRING)
        private TypeChambre typeC;

        @OneToMany(cascade = CascadeType.ALL)
        private Set<Resevarsion> resevarsion;

        @ManyToOne
        Bloc bloc;

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

        public Set<Resevarsion> getResevarsion() {
            return resevarsion;
        }

        public void setResevarsion(Set<Resevarsion> resevarsion) {
            this.resevarsion = resevarsion;
        }

        public Bloc getBloc() {
            return bloc;
        }

        public void setBloc(Bloc bloc) {
            this.bloc = bloc;
        }
    }

