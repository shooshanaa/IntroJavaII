package com.company.books;

public class Book {
    private String name;
   private Author[] authors;
    private float price;




    public Book(String name, Author[] authors, float price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public float getPrice() {
        return price;
    }

    public String getAuthors() {
        String authorsList = "";
        for (int i = 0; i < authors.length; i++) {


            if (i == authors.length -1) {
            authorsList += authors[i].getAuthorName();
            break;
        }else authorsList += authors[i].getAuthorName() + ", ";

        }
        return authorsList;
    }
}
