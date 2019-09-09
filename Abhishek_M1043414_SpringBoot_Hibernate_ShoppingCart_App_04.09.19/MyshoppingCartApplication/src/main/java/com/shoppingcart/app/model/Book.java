package com.shoppingcart.app.model;

import javax.persistence.Entity;

@Entity
public class Book extends Product {
    private String genre;
    private String authour;
    private String publiications;

    public Book() {
    }

    
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public String getPubliications() {
        return publiications;
    }

    public void setPubliications(String publiications) {
        this.publiications = publiications;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", authour='" + authour + '\'' +
                ", publiications='" + publiications + '\'' +
                '}';
    }
}
