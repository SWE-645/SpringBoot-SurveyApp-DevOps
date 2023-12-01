package com.surveys.Repository;

import com.surveys.Entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
    Survey findByEmail(String email);

}
