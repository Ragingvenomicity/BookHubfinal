package com.mapp.bookhub;

public class chem_books {
    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private int image;

    public chem_books(int id, String title, String shortdesc, double rating, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;

        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public double getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}
