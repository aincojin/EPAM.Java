package Classes.ClassesAndObjects.AggregationComposition.ex5;

import java.util.ArrayList;

public class exe {
    public static void main(String[] args) {
        ArrayList<Trip> tripBase = new ArrayList<>();
        Trip trip1 = new Trip(1, "экскурсия", "автобус", true, 7, 2700);
        Trip trip2 = new Trip(2, "отдых", "самолет", true, 14, 6800);
        Trip trip3 = new Trip(3, "экскурсия", "самолет", false, 4, 3500);
        Trip trip4 = new Trip(4, "лечение", "автобус", true, 28, 5200);
        Trip trip5 = new Trip(5, "отдых", "автобус", true, 14, 4300);

        tripBase.add(trip1);
        tripBase.add(trip2);
        tripBase.add(trip3);
        tripBase.add(trip4);
        tripBase.add(trip5);


        Client client1 = new Client(1, "Петрова А.С.");
        System.out.println("\nКлиент интересуется путевками с типом экскурсия с питанием, включенным в стоимость." +
                "Путевка должна длиться не более 10 дней и стоить не более 3000 ден.ед.\n" +
                "Доступные путевки по данным параметрам: \n");

        client1.chooseTrip(tripBase,"экскурсия" , true, 10, 3000);

        Client client2 = new Client(2, "Афанасьев А.Ф.");
        System.out.println("\nКлиент интересуется путевками с типом отдых с питанием, включенным в стоимость." +
                "Путевка должна длиться не более 20 дней.\n" +
                "Доступные путевки по данным параметрам: ");
        client2.chooseTrip(tripBase,"отдых" , true, 20, null);
        client2.sortTripsByCost();

    }
}
