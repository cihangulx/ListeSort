package com.cihan.gul.listesort;

/**
 * Created by Cihan on 31.07.2017.
 */

public class Urun {

    private String name;
    private String imageUrl;
    private double price;

    public Urun() {
    }

    public Urun(String name, String imageUrl, double price) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
