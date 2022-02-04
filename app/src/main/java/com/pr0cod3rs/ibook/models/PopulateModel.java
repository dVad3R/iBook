package com.pr0cod3rs.ibook.models;

public class PopulateBookstore{
    // Declare variables
        private String author, category, description, imageurl, title;
    private int price, quantity;

    public PopulateBookstore() {
    }

    public PopulateBookstore(String author, String category, String description, String imageurl, String title, int price, int quantity) {
        this.author = author;
        this.category = category;
        this.description = description;
        this.imageurl = imageurl;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
