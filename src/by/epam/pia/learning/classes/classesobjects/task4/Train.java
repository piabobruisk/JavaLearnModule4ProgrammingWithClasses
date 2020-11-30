package by.epam.pia.learning.classes.classesobjects.task4;

import java.time.LocalTime;

public class Train {

    private final String destination;
    private final int trainNumber;
    private final LocalTime departureTime;

    public Train(String destination, int trainNumber, LocalTime departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Поезд №" + trainNumber +
                ", пункт назначения '" + destination + '\'' +
                ", время отправления: " + departureTime;
    }
}
