package com.service.fakestore.Representinginheritance.Tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@Entity(name="tpc_Instructor")
public class Instructor extends user {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
