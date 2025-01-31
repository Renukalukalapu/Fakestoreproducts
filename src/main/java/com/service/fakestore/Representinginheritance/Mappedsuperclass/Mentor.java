package com.service.fakestore.Representinginheritance.Mappedsuperclass;

import jakarta.persistence.Entity;

@Entity(name="mapped_mentor")
public class Mentor extends user {
  private double mentor_rating;

    public double getMentor_rating() {
        return mentor_rating;
    }

    public void setMentor_rating(double mentor_rating) {
        this.mentor_rating = mentor_rating;
    }
}
