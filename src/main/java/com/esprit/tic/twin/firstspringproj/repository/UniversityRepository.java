package com.esprit.tic.twin.firstspringproj.repository;

import com.esprit.tic.twin.firstspringproj.entities.Foyer;
import com.esprit.tic.twin.firstspringproj.entities.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University,Long> {
    University findByNomUniversity(String nomUniversity);
}
