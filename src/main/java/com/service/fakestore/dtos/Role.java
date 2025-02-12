package com.service.fakestore.dtos;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;



public class Role  {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
