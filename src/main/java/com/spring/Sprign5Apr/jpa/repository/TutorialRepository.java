package com.spring.Sprign5Apr.jpa.repository;

import com.spring.Sprign5Apr.jpa.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
}
