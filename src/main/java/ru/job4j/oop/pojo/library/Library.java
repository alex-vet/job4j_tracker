package ru.job4j.oop.pojo.library;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean Code", 456);
        books[1] = new Book("Head First Java", 589);
        books[2] = new Book("JAVA Philosophy", 957);
        books[3] = new Book("Head First SQL", 365);
        System.out.println("Print array books");
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].toString());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        System.out.println("Print array books with changes");
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].toString());
        }
        System.out.println("Print only books with name \"Clean Code\"");
        for (int index = 0; index < books.length; index++) {
            if ("Clean Code".equals(books[index].getName())) {
                System.out.println(books[index].toString());
            }
        }
    }
}
