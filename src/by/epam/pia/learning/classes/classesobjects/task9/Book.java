package by.epam.pia.learning.classes.classesobjects.task9;

import java.time.LocalDate;

public class Book {

    public enum Binding {SOFT, HARD}

    private final int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int pages;
    private double price;
    private Binding bindingType;

    public Book(int id) {
        this.id = id;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Book setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
        return this;
    }

    public Book setYear(int year) {
        // если год меньше года первой печатной книги или больше текущего, оставим 0
        int currentYear = LocalDate.now().getYear();
        if (year > 1445 || year <= currentYear) this.year = year;
        return this;
    }

    public Book setPages(int pages) {
        if (pages > 1) this.pages = pages;
        return this;
    }

    public Book setPrice(double price) {
        if (price > 0) this.price = price;
        return this;
    }

    public Book setBindingType(Binding bindingType) {
        this.bindingType = bindingType;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public Binding getBindingType() {
        return bindingType;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", название:'" + name + '\'' +
                        ", автор:'" + author + '\'' +
                        ", издательство:'" + publishingHouse + '\'' +
                        ", год:" + year +
                        ", страниц:" + pages +
                        ", цена: " + price +
                        ", тип обложки:" + (bindingType == Binding.SOFT ? "мягкий" : "твердый");
    }
}
