package com.surveys.Controller;

import com.surveys.Entity.Survey;
import com.surveys.Service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;
    
    // C
    @PostMapping("create")
    public ResponseEntity<Survey> testSurvey(@RequestBody Survey survey){
        return new ResponseEntity<>(surveyService.createSurvey(survey), HttpStatus.CREATED);
    }

    // R
    @GetMapping("readAll")
    public List<Survey> readAllSurveys(){
        return surveyService.readAllSurvey();
    }

    @GetMapping("read/{emailId}")
    public ResponseEntity<Survey> readSurvey(@PathVariable("emailId") String emailId){
        return new ResponseEntity<>(surveyService.findSurveyByEmail(emailId), HttpStatus.OK);
    }

    // U
    @PutMapping("updateByEmail")
    public ResponseEntity<Survey> updateSurvey(@RequestBody Survey survey){
        return new ResponseEntity<>(surveyService.updateSurvey(survey), HttpStatus.OK);
    }

    // D
    @GetMapping("delete/{emailId}")
    public ResponseEntity<String> deleteSurvey(@PathVariable("emailId") String emailId){
        return new ResponseEntity<>(surveyService.deleteSurveyByEmail(emailId), HttpStatus.OK);
    }
}