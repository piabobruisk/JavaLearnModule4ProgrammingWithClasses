package by.epam.pia.learning.classes.classesobjects.task8;

public class Customer {

    private final int id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private long cardNumber;
    private String accountNumber;

    public Customer(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Ф.И.О " + name + ' ' + surname + ' ' + patronymic + ' ' +
                ", адрес '" + address + '\'' +
                ", номер карты: " + cardNumber +
                ", номер счета: " + accountNumber + "}";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {this.cardNumber = cardNumber;}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
