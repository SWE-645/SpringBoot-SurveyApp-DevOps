package com.surveys.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "survey")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sid")
    private Long sid;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name="last_name", nullable=false)
    private String lastName;

    @Column(name="street_address", nullable=false)
    private String streetAddress;

    @Column(name="city", nullable=false)
    private String city;

    @Column(name="state", nullable=false)
    private String state;

    @Column(name="zip", nullable=false)
    private String zip;

    @Column(name="telephone", nullable=false)
    private String phone;

    @Column(name="email", nullable=false)
    private String email;

    @Column(name="date_of_survey", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dateOfSurvey;

    public enum LikedMost {
        STUDENTS, LOCATION, CAMPUS, ATMOSPHERE, DORM_ROOMS, SPORTS
    }

    @Column(name="liked_most", nullable=false)
    @Enumerated(EnumType.STRING)
    private LikedMost likedMost;

    public enum DiscoverySource {
        FRIENDS, TELEVISION, INTERNET, OTHER
    }

    @Column(name="discovery_source", nullable=false)
    @Enumerated(EnumType.STRING)
    private DiscoverySource discoverySource;

    public enum LikelihoodOfRecommending {
        VERY_LIKELY, LIKELY, UNLIKELY
    }

    @Column(name="recommendation_likelihood", nullable=false)
    @Enumerated(EnumType.STRING)
    private LikelihoodOfRecommending recommendationLikelihood;

    @Column(name="raffle", nullable=false)
    private int raffle;

    @Column(name="comments", nullable=false)
    private String comments;
}
