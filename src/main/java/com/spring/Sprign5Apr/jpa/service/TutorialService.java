package com.spring.Sprign5Apr.jpa.service;

import com.spring.Sprign5Apr.jpa.dto.TutorialRequestDto;
import com.spring.Sprign5Apr.jpa.entity.Tutorial;

import java.util.List;

public interface TutorialService {

    void saveTutorial(TutorialRequestDto tutorialRequestDto);

    List<Tutorial> findAll();

    Tutorial getById(Long id);
}
