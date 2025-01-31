package com.service.fakestore.Representinginheritance.Mappedsuperclass;

import jakarta.persistence.Entity;

@Entity(name="mapper_instructor")
public class Instructor extends user {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
