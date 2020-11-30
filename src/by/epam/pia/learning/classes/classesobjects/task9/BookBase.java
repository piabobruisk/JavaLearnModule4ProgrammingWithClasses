package by.epam.pia.learning.classes.classesobjects.task9;

import java.util.ArrayList;

public class BookBase {

    private ArrayList<Book> books;

    public BookBase() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (book != null) books.add(book);
    }

    public ArrayList<String> getBooksFromPublishing(String house) {
        String str;
        String pattern = house.toLowerCase();
        ArrayList<String> result = new ArrayList<>();
        for (Book book : books) {
            str = book.getPublishingHouse().toLowerCase();
            if (str.matches(pattern)) {
                result.add(book.getName());
            }
        }
        return result;
    }

    public ArrayList<String> getBooksAfterYear(int year) {

        ArrayList<String> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year) {
                result.add(book.getName());
            }
        }
        return result;
    }

    public ArrayList<String> getAuthorBooks(String author) {
        String str;
        String pattern = "(.)*" + author.toLowerCase() + "(.)*";
        ArrayList<String> result = new ArrayList<>();
        for (Book book : books) {
            str = book.getAuthor().toLowerCase();
            if (str.matches(pattern)) {
                result.add(book.getName());
            }
        }
        return result;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Book book : books) {
            result.append(book);
            result.append("\n");
        }
        return result.toString();
    }
}
