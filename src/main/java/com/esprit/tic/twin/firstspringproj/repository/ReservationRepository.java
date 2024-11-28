package com.esprit.tic.twin.firstspringproj.repository;

import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.Resevarsion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Resevarsion,Long> {
    @Query("SELECT r FROM Resevarsion r WHERE r.anneUniversitaire BETWEEN :startDate AND :endDate")
    List<Resevarsion> findReservationsBetweenDates(
            @Param("startDate") Date startDate,
            @Param("endDate") Date endDate
    );
}
