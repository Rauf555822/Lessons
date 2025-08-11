package org.example.ders66;

public class Kitab {
    int id;
    String title;
    String author;

    public Kitab(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "books [id=" + id + ", title=" + title + ", author=" + author + "]";
    }
}
