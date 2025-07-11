package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book math = new Book("Math", 140);
        Book english = new Book("English", 220);
        Book history = new Book("History", 325);
        Book cleanCode = new Book("Clean Code", 1);
        Book[] books = new Book[4];

        books[0] = math;
        books[1] = english;
        books[2] = history;
        books[3] = cleanCode;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println("Replace CleanCode to Math.");
        books[0] = cleanCode;
        books[3] = math;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println("Show only book.cleanCode.");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}