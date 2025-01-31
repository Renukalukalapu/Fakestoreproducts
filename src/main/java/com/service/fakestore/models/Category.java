package com.service.fakestore.models;

import jakarta.persistence.Entity;

@Entity
public class Category extends Baseclass{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
