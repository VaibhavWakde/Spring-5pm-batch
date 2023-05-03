package com.spring.Sprign5Apr.jpa.service.impl;

import com.spring.Sprign5Apr.jpa.dto.TutorialRequestDto;
import com.spring.Sprign5Apr.jpa.entity.Tutorial;
import com.spring.Sprign5Apr.jpa.repository.TutorialRepository;
import com.spring.Sprign5Apr.jpa.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialServiceImpl implements TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public void saveTutorial(TutorialRequestDto tutorialRequestDto) {
        Tutorial tutorial = new Tutorial();
        tutorial.setTitle(tutorialRequestDto.getTitle());
        tutorial.setDescription(tutorialRequestDto.getDescription());
        tutorial.setSubject(tutorialRequestDto.getSubject());
        tutorialRepository.save(tutorial);
    }

    @Override
    public List<Tutorial> findAll() {
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial getById(Long id) {
        Optional<Tutorial> tutorialOptional = tutorialRepository.findById(id);
        return tutorialOptional.orElse(null);
    }

    @Override
    public Tutorial getTutorialByTitle(String title) {
        return tutorialRepository.findByTitle(title).orElse(null);
    }
}
