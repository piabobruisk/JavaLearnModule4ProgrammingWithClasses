package by.epam.pia.learning.classes.classesobjects.task1;

// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод,
// который находит наибольшее значение из этих двух переменных.

public class Main {

    public static void main(String[] args) {

        Test1 test = new Test1();

        test.setA(50);
        test.setB(-50);

        System.out.println(test);
        System.out.println("Сумма:"+test.getSum());
        System.out.println("Мах:"+test.getMax());
    }
}
