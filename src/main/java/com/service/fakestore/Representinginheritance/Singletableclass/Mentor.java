package com.service.fakestore.Representinginheritance.Singletableclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@Entity
@DiscriminatorValue("2")
public class Mentor extends user {
  private double mentor_rating;

    public double getMentor_rating() {
        return mentor_rating;
    }

    public void setMentor_rating(double mentor_rating) {
        this.mentor_rating = mentor_rating;
    }
}
