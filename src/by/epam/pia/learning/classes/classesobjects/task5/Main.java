package by.epam.pia.learning.classes.classesobjects.task5;

// Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
// Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
// Написать код, демонстрирующий все возможности класса.

public class Main {

    public static void main(String[] args) {
        Counter counter0 = new Counter();

        Counter counter1 = new Counter(0);
        Counter counter2 = new Counter(15);

        Counter counter3 = new Counter(10, 0);
        Counter counter4 = new Counter(5, 12);

        Counter counter5 = new Counter(10, 0, 10);
        Counter counter6 = new Counter(5, 15, 5);
        Counter counter7 = new Counter(20, 0, 8);
        Counter counter8 = new Counter(25, 20, 7);

        System.out.println("c0\tc1\tc2\tc3\tc4\tc5\tc6\tc7\tc8\t");
        System.out.println(counter0.getCount() + "\t" + counter1.getCount() + "\t" + counter2.getCount() +
                "\t" + counter3.getCount() + "\t" + counter4.getCount() + "\t" + counter5.getCount() +
                "\t" + counter6.getCount() + "\t" + counter7.getCount() + "\t" + counter8.getCount() + "\t");

        for (int i = 0; i < 20; i++) {
            counter0.increment();
            counter1.increment();
            counter2.increment();
            counter3.increment();
            counter4.increment();
            counter5.increment();
            counter6.increment();
            counter7.increment();
            counter8.increment();
            System.out.println(counter0.getCount() + "\t" + counter1.getCount() + "\t" + counter2.getCount() +
                    "\t" + counter3.getCount() + "\t" + counter4.getCount() + "\t" + counter5.getCount() +
                    "\t" + counter6.getCount() + "\t" + counter7.getCount() + "\t" + counter8.getCount() + "\t");
        }

        System.out.println();
        System.out.println("c0\tc1\tc2\tc3\tc4\tc5\tc6\tc7\tc8\t");

        for (int i = 0; i < 20; i++) {
            counter0.decrement();
            counter1.decrement();
            counter2.decrement();
            counter3.decrement();
            counter4.decrement();
            counter5.decrement();
            counter6.decrement();
            counter7.decrement();
            counter8.decrement();
            System.out.println(counter0.getCount() + "\t" + counter1.getCount() + "\t" + counter2.getCount() +
                    "\t" + counter3.getCount() + "\t" + counter4.getCount() + "\t" + counter5.getCount() +
                    "\t" + counter6.getCount() + "\t" + counter7.getCount() + "\t" + counter8.getCount() + "\t");
        }
    }
}
