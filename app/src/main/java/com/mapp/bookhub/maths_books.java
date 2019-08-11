package com.mapp.bookhub;

public class maths_books {
    private int id;
    private String title;
    private String shortdesc;
    private double rating;
    private double price;
    private int image1,image2;

    public maths_books(int id, String title, String shortdesc, double rating, int image1,int image2) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.image1=image1;
        this.image2 = image2;
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
    public int getImage2(){return image2;}
}
