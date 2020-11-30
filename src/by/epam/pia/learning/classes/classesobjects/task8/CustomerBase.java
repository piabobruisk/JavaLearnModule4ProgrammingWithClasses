package by.epam.pia.learning.classes.classesobjects.task8;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerBase {

    private int count;
    private ArrayList<Customer> customers;

    public CustomerBase() {
        customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, String surname, String patronymic, String address) {
        String regex = "[a-zA-Z]+";
        if (name.matches(regex) && surname.matches(regex) && patronymic.matches(regex)) {
            Customer customer = new Customer(count);

            customer.setName(name);
            customer.setSurname(surname);
            customer.setPatronymic(patronymic);
            customer.setAddress(address);

            long card = getCardNumber(count);
            if (card == 0) return false; // много покупателей на всех не хватает карт :-)
            //а можно и исключение выкидывать ( тогда и на непрвильное ФИО)

            customer.setCardNumber(card);
            customer.setAccountNumber("BY" + count + "CUST" + String.valueOf(card).substring(6,15));

            customers.add(customer);
            count++;
            return true;
        }
        return false;
    }

    private long getCardNumber(int count) {

        long[] card = {4421_9004_9847_0503L, 4421_9004_9847_0503L,
                5189_9422_2776_2171L, 4794_7844_4639_9496L,
                5176_9270_6312_6834L, 4166_8949_8653_9037L,
                4837_8503_6232_3981L, 370371890671727L};
        if (count < card.length) return card[count];
        return 0;
    }

    /*public ArrayList<Customer> getAllName() {

        Comparator<Customer> comparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                int result = o1.getName().compareTo(o2.getName());
                if (result == 0) {
                    result = o1.getSurname().compareTo(o2.getSurname());
                    if (result == 0) {
                        result = o1.getPatronymic().compareTo(o2.getPatronymic());
                    }
                }
                return result;
            }
        };

        customers.sort(comparator);
        //Найти и вывести:
        //a) список покупателей в алфавитном порядке;

        // наверно в данном случае так делать нельзя. в точке вызова метода я получу доступ к базе
        // и смогу менять данные покупателей???
        return customers;
    }*/

    public ArrayList<String> getAllName() {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);

            }
        };

        ArrayList<String> result = new ArrayList<>();
        for (Customer customer : customers) {
            result.add(customer.getName() + " " + customer.getSurname() + " " + customer.getPatronymic());
        }

        result.sort(comparator);
        //Найти и вывести:
        //a) список покупателей в алфавитном порядке;

        //  так вернуть список покупателей наверно правильно
        return result;
    }

    public ArrayList<String> getCardHolders(char mii) {

        ArrayList<String> result = new ArrayList<>();

        for (Customer customer : customers) {
            char digit =  String.valueOf(customer.getCardNumber()).charAt(0);
            if (digit == mii) {
                result.add(customer.getName() + " " + customer.getSurname() + " " + customer.getPatronymic());
            }
        }
        return result;
    }
}
