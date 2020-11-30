package by.epam.pia.learning.classes.classesobjects.task9;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import java.util.ArrayList;

public class Main {

    private static BookBase base;

    public static void main(String[] args) {

        base = new BookBase();
        createBase();
        System.out.println(base);

        String author = "Лукьяненко";
        System.out.print("Книги автора "+author+":");
        ArrayList <String> result=base.getAuthorBooks(author);
        if (! result.isEmpty()) {
            System.out.println();
            for (String name :result) {
                System.out.println(name);
            }
        }else {
            System.out.println(" отсутствуют.");
        }
        System.out.println();



        String house = "Аст";
        System.out.print("Книги издательства "+house+":");
        result=base.getBooksFromPublishing(house);
        if (! result.isEmpty()) {
            System.out.println();
            for (String name :result) {
                System.out.println(name);
            }
        }else {
            System.out.println(" отсутствуют.");
        }
        System.out.println();

        int year = 2019;
        System.out.print("Книги выпущенные после "+year+" года:");
        result=base.getBooksAfterYear(year);
        if (! result.isEmpty()) {
            System.out.println();
            for (String name :result) {
                System.out.println(name);
            }
        }else {
            System.out.println(" отсутствуют.");
        }
        System.out.println();
    }

    public static void createBase(){
        Book book;

        book = new Book(0);
        book.setName("Ведьмак. Последнее желание. Меч предназначения")
                .setAuthor("Анджей Сапковский")
                .setPublishingHouse("АСТ")
                .setYear(2020)
                .setPages(672)
                .setPrice(143.96)
                .setBindingType(Book.Binding.HARD);
        base.addBook(book);

        book = new Book(1);
        book.setName("Иллюстрированные правила дорожного движения Республики Беларусь")
                .setAuthor("")
                .setPublishingHouse("Аверсэв")
                .setYear(2020)
                .setPages(96)
                .setPrice(5.9)
                .setBindingType(Book.Binding.SOFT);
        base.addBook(book);

        book = new Book(2);
        book.setName("Порог")
                .setAuthor("Сергей Лукьяненко")
                .setPublishingHouse("АСТ")
                .setYear(2019)
                .setPages(352)
                .setPrice(16.11)
                .setBindingType(Book.Binding.HARD);
        base.addBook(book);

        book = new Book(3);
        book.setName("Английский язык. 3 класс. Рабочая тетрадь-1")
                .setAuthor("")
                .setPublishingHouse("Аверсэв")
                .setYear(2020)
                .setPages(96)
                .setPrice(4.94)
                .setBindingType(Book.Binding.SOFT);
        base.addBook(book);

        book = new Book(4);
        book.setName("Танцы на снегу. Геном. Калеки")
                .setAuthor("Сергей Лукьяненко")
                .setPublishingHouse("АСТ")
                .setYear(2020)
                .setPages(768)
                .setPrice(25.16)
                .setBindingType(Book.Binding.HARD);
        base.addBook(book);

        book = new Book(5);
        book.setName("Совершенный код. Мастер-класс")
                .setAuthor("Стив МакКоннелл")
                .setPublishingHouse("Русская редакция")
                .setYear(2019)
                .setPages(896)
                .setPrice(66.45)
                .setBindingType(Book.Binding.HARD);
        base.addBook(book);

        book = new Book(6);
        book.setName("Лорд с планеты Земля")
                .setAuthor("Сергей Лукьяненко")
                .setPublishingHouse("АСТ")
                .setYear(2019)
                .setPages(480)
                .setPrice(16.84)
                .setBindingType(Book.Binding.HARD);
        base.addBook(book);
    }
}
