package com.service.fakestore.dtos;

import lombok.Getter;
import lombok.Setter;


public class FakeStoreProductdto {
       private long id;
        private String title;
        private double price;
        private String category;
        private String description;
        private String image;

//    public FakeStoreProductdto(long id, String title, double price, String category, String description, String image) {
//        this.id = id;
//        this.title = title;
//        this.price = price;
//        this.category = category;
//        this.description = description;
//        this.image = image;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
