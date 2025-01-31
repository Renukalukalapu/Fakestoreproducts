package com.service.fakestore.Representinginheritance.Singletableclass;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class TA extends user {
    private int num_of_sessions;
    private double avg_rating;

    public int getNum_of_sessions() {
        return num_of_sessions;
    }

    public void setNum_of_sessions(int num_of_sessions) {
        this.num_of_sessions = num_of_sessions;
    }

    public double getAvg_rating() {
        return avg_rating;
    }

    public void setAvg_rating(double avg_rating) {
        this.avg_rating = avg_rating;
    }
}
