package by.epam.pia.learning.classes.classesobjects.task10;

import java.time.LocalTime;
import java.util.Arrays;

public class Airline {

    public enum Aircraft {TU, SUKHOI, IL, AIRBUS, BOEING}
    public enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

	private String destination;
    private String flightNumber;
    private  Aircraft   aircraftType;
    private LocalTime departureTime;
    private Days[] daysWeek;

	public Airline(String destination, String flightNumber, Aircraft aircraftType, LocalTime departureTime, Days[] daysWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.daysWeek = daysWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Aircraft getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(Aircraft aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public Days[] getDaysWeek() {
		return daysWeek;
	}

	public void setDaysWeek(Days[] daysWeek) {
		this.daysWeek = daysWeek;
	}

	@Override
	public String toString() {
		return "Airline{" +
				"destination='" + destination + '\'' +
				", flightNumber='" + flightNumber + '\'' +
				", aircraftType=" + aircraftType +
				", departureTime=" + departureTime +
				", daysWeek=" + Arrays.toString(daysWeek) +
				'}';
	}
}
/*
  	Направление 	        Рейс 	 Тип самолета   	Время вылета    Дни недели
    Хургада 	            BRU8281  Aircraft.BOEING	01:00			Days.MONDAY, Days.WEDNESDAY, Days.FRIDAY
    Шарм-Эль-Шейх 	        BRU8195  Aircraft.AIRBUS   	03:05			Days.TUESDAY, Days.THURSDAY, Days.SATURDAY
    Хургада 	            BRU9207  Aircraft.TU       	04:05			Days.SATURDAY, Days.SUNDAY
 	Душанбе 	            BRU9795  Aircraft.IL		08:25			Days.MONDAY, Days.WEDNESDAY
 	Киев (Борисполь) 	    B2843    Aircraft.TU       	08:35			Days.TUESDAY, Days.THURSDAY, Days.SATURDAY
 	Стамбул (Новый) 	    B2783    Aircraft.TU       	09:20			Days.MONDAY, Days.WEDNESDAY, Days.FRIDAY
    Амстердам (Схипхол)     B2867    Aircraft.TU       	10:30			Days.FRIDAY, Days.SATURDAY
    Париж (Шарль Де Голль)  B2865    AircraftSUKHOI    	11:40			Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY
 	Берлин (Бранденбург)    B2891    Aircraft.BOEING  	12:25			Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY
 	Стокгольм (Арланда)     B2855    AircraftSUKHOI	   	12:30			Days.WEDNESDAY, Days.SATURDAY
 	Варшава (Шопен) 	    B2895    Aircraft.TU      	15:00			Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY, Days.THURSDAY, Days.FRIDAY, Days.SATURDAY, Days.SUNDAY
 	Киев (Борисполь) 	    B2845    Aircraft.BOEING  	18:20			Days.MONDAY, Days.WEDNESDAY, Days.FRIDAY
 	Ташкент 	            B2755    Aircraft.AIRBUS   	20:10			Days.MONDAY, Days.WEDNESDAY
 	Нур-Султан 	            B2775    Aircraft.AIRBUS   	20:15			Days.MONDAY, Days.FRIDAY
*/
/*
 TU-134
 TU-154
 TU-204
 Sukhoi SuperJet-100
 IL-62
 Il-86
 Il-96
 Airbus A310
 Airbus A320
 Airbus A330
 Boeing-737
 Boeing-747
 Boeing-767
 Boeing-777
*/