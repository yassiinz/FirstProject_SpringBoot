package com.esprit.tic.twin.firstspringproj.repository;

import com.esprit.tic.twin.firstspringproj.entities.Chamber;
import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ChambreRepository extends JpaRepository<Chamber,Long> {
    @Query("SELECT c FROM Chambre c WHERE c.bloc.nomBloc := nomBloc AND c.typeC = :typeC")
    List<Chamber> FindChambreByBloc(@Param("nomBloc") String nomBloc , @Param("typeC")TypeChambre typeC);

    @Query("SELECT c FROM Chambre c JOIN c.resevarsion rs Where rs.estValide = :estValide")
    List<Chamber> FindChambreByReservation(@Param("estValide") Boolean estValide);

    @Query("SELECT c FROM Chambre c WHERE c.bloc.nomBloc := nomBloc AND c.bloc.capaciteBloc > :capaciteBloc")
    List<Chamber> FindChambreByBlocAndCapacite(@Param("nomBloc") String nomBloc , @Param("capaciteBloc") Long capaciteBloc);
}
