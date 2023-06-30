package Classes.ClassesAndObjects.Airline;

import java.util.ArrayList;

public class AirlineArray {
    private ArrayList<Airline> flights;

    AirlineArray(ArrayList<Airline> flights){
        this.flights = flights;
    }
    void addFlight(String destination, int flightNum, String planeType, String flightTime,
                   String flightDays){
        this.flights.add(new Airline(destination, flightNum, planeType,
                flightTime, flightDays));
    }

    ArrayList<Airline> getFlightByDestination(String destination){
        ArrayList<Airline> list1 = new ArrayList<>();
        for(Airline flight : this.flights){
            if(flight.getDestination().compareToIgnoreCase(destination)==0){
                list1.add(flight);
            }
        }
        return list1;
    }
    ArrayList<Airline> getFlightByWeekday(String weekday){
        ArrayList<Airline> list2 = new ArrayList<>();
        for(Airline flight : this.flights){
            if(flight.getFlightDays().contains(weekday.toLowerCase())){
                list2.add(flight);
            }
        }
        return list2;
    }
    ArrayList<Airline> getFlightByWeekdayAndTime(String weekday, String time){
        ArrayList<Airline> list3 = new ArrayList<>();
        for(Airline flight : this.flights){
            if(flight.getFlightDays().contains(weekday.toLowerCase()) &&
            flight.getFlightTime().compareTo(time) >= 0){
                list3.add(flight);
            }
        }
        return list3;
    }
    public ArrayList<Airline> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Airline> flights) {
        this.flights = flights;
    }
}
