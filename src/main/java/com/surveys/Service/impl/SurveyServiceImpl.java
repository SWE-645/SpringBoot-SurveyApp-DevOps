package com.surveys.Service.impl;

import com.surveys.Entity.Survey;
import com.surveys.Repository.SurveyRepository;
import com.surveys.Service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImpl implements SurveyService
{
    @Autowired
    private SurveyRepository surveyRepository;

    @Override
    public Survey createSurvey(Survey survey) {

        surveyRepository.save(survey);
        return survey;
    }

    @Override
    public List<Survey> readAllSurvey() {
        return surveyRepository.findAll();
    }

    @Override
    public Survey updateSurvey(Survey survey) {
        // Get employee from DB
        Survey updateSurvey = surveyRepository.findByEmail(survey.getEmail());

        updateSurvey.setFirstName(survey.getFirstName());
        updateSurvey.setLastName(survey.getLastName());
        updateSurvey.setStreetAddress(survey.getStreetAddress());
        updateSurvey.setCity(survey.getCity());
        updateSurvey.setState(survey.getState());
        updateSurvey.setZip(survey.getZip());
        updateSurvey.setPhone(survey.getPhone());
        updateSurvey.setDateOfSurvey(survey.getDateOfSurvey());
        updateSurvey.setLikedMost(survey.getLikedMost());
        updateSurvey.setDiscoverySource(survey.getDiscoverySource());
        updateSurvey.setRecommendationLikelihood(survey.getRecommendationLikelihood());
        updateSurvey.setRaffle(survey.getRaffle());
        updateSurvey.setComments(survey.getComments());

        surveyRepository.save(updateSurvey);
        return updateSurvey;
    }

    @Override
    public Survey findSurveyByEmail(String email) {
        return surveyRepository.findByEmail(email);
    }

    @Override
    public String deleteSurveyByEmail(String email) {
        surveyRepository.delete(surveyRepository.findByEmail(email));
        return email + " deleted successfully!";
    }


}
