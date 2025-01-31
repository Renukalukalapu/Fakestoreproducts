package com.service.fakestore.Representinginheritance.Joinedclass;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "Joined_instructor")
@PrimaryKeyJoinColumn(name="user_id")
public class Instructor extends user {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
