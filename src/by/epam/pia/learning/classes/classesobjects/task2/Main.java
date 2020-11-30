package by.epam.pia.learning.classes.classesobjects.task2;

// Создйте класс Test2 двумя переменными. Добавьте конструктор с входными
// параметрами. Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.

public class Main {

    public static void main(String[] args) {

        Test2 t1 = new Test2();
        Test2 t2 = new Test2(100,500);

        System.out.println("Test2 t1  a="+t1.getA()+" b="+t1.getB());
        System.out.println("Test2 t2  a="+t2.getA()+" b="+t2.getB());

        t1.setA(10);
        t1.setB(180);
        t2.setA(-10);
        t2.setB(-180);

        System.out.println("Test2 t1  a="+t1.getA()+" b="+t1.getB());
        System.out.println("Test2 t2  a="+t2.getA()+" b="+t2.getB());
    }
}
