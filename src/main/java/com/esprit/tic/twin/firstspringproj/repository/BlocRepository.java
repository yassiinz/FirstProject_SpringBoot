package com.esprit.tic.twin.firstspringproj.repository;

import com.esprit.tic.twin.firstspringproj.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface BlocRepository extends JpaRepository<Bloc,Long> {
    @Query("SELECT b FROM Bloc b WHERE b.foyer.university.nomUniversity = :university")
    List<Bloc> findBlocByUni(@Param("university") String uni);
}
