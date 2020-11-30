package by.epam.pia.learning.classes.classesobjects.task10;

import java.time.LocalTime;
import java.util.ArrayList;

public class Shedule {

    private ArrayList<Airline> departureSchedule;

    public Shedule() {
        departureSchedule = new ArrayList<>();
    }

    public void add(Airline air) {
        departureSchedule.add(air);
    }

    public ArrayList <Airline> getAirlineForDestination(String destination){

        ArrayList <Airline> result = new ArrayList<>();
        String pattern = "(.)*" + destination.toLowerCase().trim() + "(.)*";
        for (Airline airline : departureSchedule) {
            String str = airline.getDestination().toLowerCase();
            if (str.matches(pattern)){
                result.add(airline);
            }
        }
        return result;
    }

    public ArrayList<Airline> getAirlineForDay(String now) {

        ArrayList <Airline> result = new ArrayList<>();
        Airline.Days[] days;
        for (Airline airline : departureSchedule) {
            days=airline.getDaysWeek();
            for (Airline.Days day : days) {
               if (day.name().equals(now)){
                   result.add(airline);
                   break;
               }
            }
        }
        return result;
    }

    public ArrayList<Airline> getAirlineForDayTime(String now, LocalTime time) {

        ArrayList <Airline> result = new ArrayList<>();
        Airline.Days[] days;
        for (Airline airline : departureSchedule) {
            days=airline.getDaysWeek();
            for (Airline.Days day : days) {
                if (day.name().equals(now)){
                    if (airline.getDepartureTime().isAfter(time)) {
                        result.add(airline);
                    }
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        for (Airline airline : departureSchedule) {
            result.append(airline);
            result.append("\n");
        }
        return result.toString();
    }
}
