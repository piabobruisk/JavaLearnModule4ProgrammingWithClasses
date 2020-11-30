package by.epam.pia.learning.classes.classesobjects.task6;

// Составьте описание класса для представления времени.
// Предусмотрте возможности установки времени и изменения его отдельных полей
// (час, минута, секунда) с проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Main {

    public static void main(String[] args) {

        MyTime time = new MyTime(12,10,00);

        System.out.println(time);

        time.increaseHours(1);
        System.out.println("Плюс 1 час - "+time);
        time.decreaseHours(1);
        System.out.println("Минус 1 час - "+time);

        time.increaseMinutes(10);
        System.out.println("Плюс 10 мин - "+time);
        time.decreaseMinutes(10);
        System.out.println("Минус 10 мин - "+time);

        time.increaseMinutes(80);
        System.out.println("Плюс 80 мин - "+time);
        time.decreaseMinutes(80);
        System.out.println("Минус 80 мин - "+time);

        time.increaseSeconds(30);
        System.out.println("Плюс 30 сек - "+time);
        time.decreaseSeconds(30);
        System.out.println("Минус 30 сек - "+time);

        time.increaseSeconds(80);
        System.out.println("Плюс 80 сек - "+time);
        time.decreaseSeconds(80);
        System.out.println("Минус 80 сек - "+time);

        time.increaseSeconds(3600);
        System.out.println("Плюс 3600 сек - "+time);
        time.decreaseSeconds(3600);
        System.out.println("Минус 3600 сек - "+time);

    }
}
