package com.surveys.Service;

import com.surveys.Entity.Survey;

import java.util.List;

public interface SurveyService {
    Survey createSurvey(Survey survey);

    List<Survey> readAllSurvey();

    Survey updateSurvey(Survey survey);

    Survey findSurveyByEmail(String email);

    String deleteSurveyByEmail(String email);
}
