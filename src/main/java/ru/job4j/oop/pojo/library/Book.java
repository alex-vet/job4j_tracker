package ru.job4j.oop.pojo.library;

public class Book {
    private String name;
    private int countPages;

    public Book(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    @Override
    public String toString() {
        return "Book{"
                + "name='" + name + '\''
                + ", countPages=" + countPages
                + '}';
    }
}
