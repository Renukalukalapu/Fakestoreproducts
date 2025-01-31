package com.service.fakestore.Representinginheritance.Joinedclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name="Joined_mentor")
@PrimaryKeyJoinColumn(name="user_id")
public class Mentor extends user {
    private double mentor_rating;

    public double getMentor_rating() {
        return mentor_rating;
    }

    public void setMentor_rating(double mentor_rating) {
        this.mentor_rating = mentor_rating;
    }
}
