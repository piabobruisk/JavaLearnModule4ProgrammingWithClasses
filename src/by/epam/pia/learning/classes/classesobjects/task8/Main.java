package by.epam.pia.learning.classes.classesobjects.task8;

//8. Создать класс Customer, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.util.Random;


public class Main {

    public static final char MASTERCARD = '5';
    public static final char VISA = '4';
    public static final char AMERICANEXPRESS = '3';

    public static void main(String[] args) {

        CustomerBase base=new CustomerBase();
        String name, surname,patronymic;
        String address;
        for (int i = 0; i < 10; i++) {
            name=getName();
            surname=getSurname();
            patronymic=getPatronymic();
            address=getAddress();
            System.out.print("Покупатель "+name+" "+surname+" "+patronymic);
            if (base.addCustomer(name,surname,patronymic, address)){
                System.out.println(" создан");
            }else {
                System.out.println(" не создан");
            }
        }

        System.out.println("\nCписок покупателей");

        for (Customer customer : base.getCustomers()) {
            System.out.println(customer);
        }

        System.out.println("\nCписок покупателей в алфавитном порядке");

        for (String fio : base.getAllName()) {
            System.out.println(fio);
        }

        System.out.println("\nCписок покупателей - держателей карт Visa");

        for (String fio : base.getCardHolders(VISA)) {
            System.out.println(fio);
        }

        System.out.println("\nCписок покупателей - держателей карт MasterCard");

        for (String fio : base.getCardHolders(MASTERCARD)) {
            System.out.println(fio);
        }

        System.out.println("\nCписок покупателей - держателей карт American Express");

        for (String fio : base.getCardHolders(AMERICANEXPRESS)) {
            System.out.println(fio);
        }

    }
    private static String getName(){
        String[] name={"Ivanov","Petrov", "Sidorov", "Petushkov", "Loshkov" };

        Random random= new Random();
        return name[random.nextInt(name.length)];
    }

    private static String getSurname(){
        String[] name={"Ivan","Petr", "Sidor", "Hariton", "Dmitro" };

        Random random= new Random();
        return name[random.nextInt(name.length)];
    }

    private static String getPatronymic(){
        String[] name={"Ivanovich","Petrovich", "Sidorovich", "Haritonovich", "Dmitrovich" };

        Random random= new Random();
        return name[random.nextInt(name.length)];
    }

    private static String getAddress(){
        String[] name={"Moscow, Shabolovka 37",
                       "Minsk, Partizansky 100",
                       "Kiev, Tarasa Shevchenko 2",
                       "Moscow, Bolotnaya 2",
                       "Minsk, Kozlova 1" };

        Random random= new Random();
        return name[random.nextInt(name.length)];
    }
}
