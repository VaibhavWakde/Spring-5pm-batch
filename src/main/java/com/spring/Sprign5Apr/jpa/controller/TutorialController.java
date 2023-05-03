package com.spring.Sprign5Apr.jpa.controller;

import com.spring.Sprign5Apr.jpa.dto.TutorialRequestDto;
import com.spring.Sprign5Apr.jpa.entity.Tutorial;
import com.spring.Sprign5Apr.jpa.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutorials")
public class TutorialController {
    @Autowired
    private TutorialService tutorialService;

    @PostMapping
    public String saveTutorial(@RequestBody TutorialRequestDto tutorialRequestDto) {
        tutorialService.saveTutorial(tutorialRequestDto);
        return "Record Saved Successfully";
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {
        try{
            return ResponseEntity.ok(tutorialService.findAll());

        } catch (Exception e) {
            return new ResponseEntity<>("No records", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Tutorial tutorial = tutorialService.getById(id);
        if(tutorial != null ){
            return ResponseEntity.ok(tutorial);
        }
        else
            return new ResponseEntity<>("Record with id " + id + " does not exisits",HttpStatus.NOT_FOUND);
    }

    @GetMapping("/findByTitle")
    public ResponseEntity<?> findByTitle(@RequestParam String title) {
        Tutorial tutorial = tutorialService.getTutorialByTitle(title);
        if(tutorial != null ){
            return ResponseEntity.ok(tutorial);
        }
        else
            return new ResponseEntity<>("Record with title " + title + " does not exisits",HttpStatus.NOT_FOUND);
    }
}
