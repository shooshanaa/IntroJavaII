package com.company.books;

public class Author {
    private String authorName;
    private int authorAge;
    private char gender;

    public Author(String authorName, int authorAge, char gender) {
        this.authorName = authorName;
        this.authorAge = authorAge;
        this.gender = gender;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public char getGender() {
        return gender;
    }
}
