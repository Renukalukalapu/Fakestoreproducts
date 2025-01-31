package com.service.fakestore.Representinginheritance.Tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@Entity(name="tpc_mentor")
public class Mentor extends user {
  private double mentor_rating;

    public double getMentor_rating() {
        return mentor_rating;
    }

    public void setMentor_rating(double mentor_rating) {
        this.mentor_rating = mentor_rating;
    }
}
