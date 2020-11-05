package com.example.recycleviewexample;


import java.io.Serializable;

public class ProductEntity implements Serializable {
    private String name;
    private int image;
    private int price;

    public ProductEntity(String name, int image, int price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public ProductEntity() {
        this("",0,0);
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
