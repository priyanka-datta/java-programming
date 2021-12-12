package com.priyanka.datta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book(3,"Macbeth","Shakespeare")
                ,new Book(2,"Gitanjali","R.N.Tagore"));
        Collections.sort(books);
        System.out.println(books.toString());
    }

}

class Book implements Comparable<Book>{
    private int id;

    private String name;

    private String authorName;

    public Book() {
    }

    public Book(int id, String name, String authorName) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        if (this.getId()==o.getId())
            return 0;
        else if (this.getId()>o.getId())
            return 1;
        else
            return -1;
    }
}
