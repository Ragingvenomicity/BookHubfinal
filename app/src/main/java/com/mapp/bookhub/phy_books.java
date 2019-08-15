package com.mapp.bookhub;

public class phy_books {
    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private int image1;
    private int button;
    public phy_books(int id, String title, String shortdesc, double rating,int image1,int button) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.image1=image1;
        this.button=button;



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

    public int getImage1() {
        return image1;
    }

}
