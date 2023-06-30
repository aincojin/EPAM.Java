package Classes.ClassesAndObjects.Airline;


import java.util.ArrayList;

public class Airline {
    private String destination;
    private int flightNum;
    private String planeType;
    private String flightTime;
    private String flightDays;

    Airline(String destination, int flightNum, String planeType, String flightTime,
            String flightDays){
        this.destination = destination;
        this.flightNum = flightNum;
        this.planeType = planeType;
        this.flightTime = flightTime;
        this.flightDays = flightDays;
    }
    @Override
        public String toString(){
        return destination + "\n" + flightNum + "\n" + planeType+ "\n"
                + flightTime+ "\n" +flightDays + "\n" ;
    }

    public static void main(String[] args) {
        AirlineArray flights = new AirlineArray(new ArrayList<>());
        flights.addFlight("Варшава", 213, "Boeing 737-500",
                "17:13", "понедельник, четверг");
        flights.addFlight("Берлин", 134, "Boeing 210 RJ-175",
                "11:21", "понедельник, пятница");
        flights.addFlight("Стамбул", 811, "Boeing 210 175",
                "21:10", "вторник");

        System.out.println("Выведем все рейсы на Варшаву: ");
        ArrayList<Airline> list1 = flights.getFlightByDestination("варшава");
        if(list1.size() == 0){
            System.out.println("Рейсы не найдены.");
        }else{
            for(Airline flight : list1){
                System.out.println(flight);
            }
        }

        System.out.println("Выведем все рейсы в понедельник: ");
        ArrayList<Airline> list2 = flights.getFlightByWeekday("Понедельник");
        if(list2.size() == 0){
            System.out.println("Рейсы не найдены.");
        }else{
            for(Airline flight : list2){
                System.out.println(flight);
            }
        }
        System.out.println("Выведем все рейсы в понедельник позже 12:00: ");
        ArrayList<Airline> list3 = flights.getFlightByWeekdayAndTime("Понедельник", "12:00");
        if(list3.size() == 0){
            System.out.println("Рейсы не найдены.");
        }else{
            for(Airline flight : list3){
                System.out.println(flight);
            }
        }
    }


    public String getDestination(){
        return  destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getFlightTime() {
        return flightTime;
    }
    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }
    public String getFlightDays() {
        return flightDays;
    }
    public void setFlightDays(String flightDays) {
        this.flightDays = flightDays;
    }
}
