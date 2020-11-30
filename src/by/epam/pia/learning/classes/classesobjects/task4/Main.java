package by.epam.pia.learning.classes.classesobjects.task4;

// +++ Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// +++ Создайте данные в массив из пяти элементов типа Train,
// +++ добавьте возможность сортировки элементов массива по номерам поездов.
// +++ Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Station station = new Station();
        System.out.printf("Расписание движения поездов по станции Мухосранск:\n" + station);

        int trainNumber;
        do {
            trainNumber = input("\nВведите номер поезда (начинаются с 1):");
        } while (trainNumber < 1);

        System.out.print("\nПоезд с номером " + trainNumber);
        Train train = station.getTrainFromNumber(trainNumber);
        if (train != null) {
            System.out.println();
            System.out.println(train);
        } else {
            System.out.println(" не существует.");
        }

        station.sortByNumber();
        System.out.println("\nРасписание отсортировано по номерам поездов \n" + station);

        station.sortByDestination();
        System.out.println("\nРасписание отсортировано по станциям назначения \n" + station);
    }

    private static int input(String prompt) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        return scanner.nextInt();
    }
}
