package by.epam.pia.learning.classes.classesobjects.task4;

import java.time.LocalTime;

public class Station {

    private Train[] trains = new Train[5];

    public Station() {

        trains[0] = new Train("Moscow", 4, LocalTime.of(0, 17));
        trains[1] = new Train("Minsk", 5, LocalTime.of(8, 32));
        trains[2] = new Train("Kiev", 1, LocalTime.of(23, 0));
        trains[3] = new Train("Minsk", 3, LocalTime.of(9, 57));
        trains[4] = new Train("Minsk", 2, LocalTime.of(11, 30));
    }

    public Train getTrainFromNumber(int number) {

        for (Train train : trains) {
            if (train.getTrainNumber() == number) return train;
        }
        return null;
    }

    public void sortByNumber() {

        for (int i = 1, trainslength = trains.length; i < trainslength; i++) {
            for (int j = i; j > 0 &&
                    trains[j - 1].getTrainNumber() > trains[j].getTrainNumber(); j--) {
                swap(j, j - 1);
            }
        }
    }

    public void sortByDestination() {

        for (int i = 1, trainslength = trains.length; i < trainslength; i++) {
            for (int j = i; j > 0; j--) {
                int result = trains[j - 1].getDestination().compareTo(trains[j].getDestination());
                if (result > 0) {
                    swap(j, j - 1);
                } else if (result == 0) {
                    if (trains[j - 1].getDepartureTime().isAfter(trains[j].getDepartureTime())) {
                        swap(j, j - 1);
                    }
                }

            }
        }
    }

    private void swap(int ind1, int ind2) {

        Train tmp = trains[ind1];
        trains[ind1] = trains[ind2];
        trains[ind2] = tmp;
    }


    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        for (Train train : trains) {
            result.append(train);
            result.append("\n");
        }
        return result.toString();
    }
}
