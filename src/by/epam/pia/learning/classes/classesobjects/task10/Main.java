package by.epam.pia.learning.classes.classesobjects.task10;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
// Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static Shedule shedule;

    public static void main(String[] args) {

        shedule = new Shedule();
        try {
            getData();
            System.out.println(shedule);

            //a) список рейсов для заданного пункта назначения;
            String destination = "КИЕВ";
            ArrayList<Airline> result = shedule.getAirlineForDestination(destination);
            shedulePrint(result, "Рейсы по направлению " + destination);


            //b) список рейсов для заданного дня недели;
            String day = LocalDate.now().getDayOfWeek().toString();
            result = shedule.getAirlineForDay(day);
            shedulePrint(result, "Рейсы на " + day);

            //c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
            LocalTime time = LocalTime.now();
            result = shedule.getAirlineForDayTime(day, time);
            shedulePrint(result, "Оставшиеся рейсы на сегодня");

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла!!!");
        }

    }


    private static void shedulePrint(ArrayList<Airline> shedule, String title) {

        System.out.print(title);

        if (!shedule.isEmpty()) {

            System.out.println("\n------------------------------------------------------------");

            String[] columnName = {"Пункт назначения", "номер рейса", "тип самолета", "время вылета", "дни недели"};
            int[] fieldsLen = getMaxLength(shedule, columnName);

            for (int i = 0, len =columnName.length ; i < len; i++) {
                System.out.printf("%-" + (fieldsLen[i] + 2) + "s", columnName[i]);
            }
            System.out.println();

            for (Airline airline : shedule) {
                System.out.printf("%-" + (fieldsLen[0] + 2) + "s", airline.getDestination());
                System.out.printf("%-" + (fieldsLen[1] + 2) + "s", airline.getFlightNumber());
                System.out.printf("%-" + (fieldsLen[2] + 2) + "s", airline.getAircraftType());
                System.out.printf("%-" + (fieldsLen[3] + 2) + "s", airline.getDepartureTime());
                System.out.printf("%-" + (fieldsLen[4] + 2) + "s", Arrays.toString(airline.getDaysWeek()));
                System.out.println();
            }
        } else {
            System.out.println(" отсутствуют!!!");
        }
        System.out.println();
    }

    private static int[] getMaxLength(ArrayList<Airline> shedule, String[] name) {

        int[] result = new int[name.length];

        for (int i = 0, length = name.length; i < length; i++) {
            result[i] = name[i].length();
        }

        for (Airline airline : shedule) {
            result[0] = Math.max(airline.getDestination().length(), result[0]);
            result[1] = Math.max(airline.getFlightNumber().length(), result[1]);
            result[2] = Math.max(airline.getAircraftType().name().length(), result[2]);
            result[3] = Math.max(airline.getDepartureTime().toString().length(), result[3]);
            result[4] = Math.max(Arrays.toString(airline.getDaysWeek()).length(), result[4]);
        }
        return result;
    }

    private static void getData() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("data/departure_schedule.csv"));
        String line;
        String[] fields;
        String[] days;
        int count = 0;

        String destination;
        String flightNumber;
        Airline.Aircraft aircraftType;
        LocalTime departureTime;
        Airline.Days[] daysWeek;

        while ((line = reader.readLine()) != null) {
            if (count > 0) {
                try {
                    fields = line.split(";");

                    destination = fields[0].trim();
                    flightNumber = fields[1].trim();
                    aircraftType = Airline.Aircraft.valueOf(fields[2].trim().toUpperCase());
                    departureTime = LocalTime.parse(fields[3].trim());
                    days = fields[4].split(",");
                    daysWeek = new Airline.Days[days.length];

                    for (int i = 0; i < days.length; i++) {
                        daysWeek[i] = Airline.Days.valueOf(days[i].trim().toUpperCase());
                    }

                    shedule.add(new Airline(destination, flightNumber, aircraftType, departureTime, daysWeek));

                } catch (DateTimeParseException | IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ошибка данных в строке " + (count + 1));
                }
            }
            count++;
        }
    }
}
