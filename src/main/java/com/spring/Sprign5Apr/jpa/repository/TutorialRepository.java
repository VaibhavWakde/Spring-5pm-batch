package com.spring.Sprign5Apr.jpa.repository;

import com.spring.Sprign5Apr.jpa.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TutorialRepository extends JpaRepository<Tutorial,Long> {

    Optional<Tutorial> findByTitle(String title);
}
