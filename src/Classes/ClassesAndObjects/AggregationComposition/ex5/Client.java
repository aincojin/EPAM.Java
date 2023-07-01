package Classes.ClassesAndObjects.AggregationComposition.ex5;


import java.util.ArrayList;

public class Client {
    private int clientId;
    private String fullName;
    private ArrayList<Trip> trips;

    Client(int clientId, String fullName){
        this.clientId = clientId;
        this.fullName = fullName;
        this.trips = new ArrayList<>();

    }

    public void chooseTrip(ArrayList<Trip> tripBase, String type, boolean foodIncluded, Integer days, Integer cost) {
        System.out.println("Путевки по введенным параметрам: ");
        boolean isTrip = false; // Перемещаем объявление перед циклом
        for (Trip trip : tripBase) {
            if (trip.getTripType().equalsIgnoreCase(type)) {
                if (days != null && trip.getDuration() > days) {
                    continue;
                }
                if (cost != null && trip.getCost() > cost) {
                    continue;  // Пропустить путевку, если указана стоимость и текущая путевка превышает заданную стоимость
                }
                if (trip.getIsFood() == foodIncluded) {
                    isTrip = true;
                }else continue;

                trips.add(trip);
                System.out.println(trip + "\n");
            }
        }
        if (!isTrip) {
            System.out.println("Нет путевок, подходящих по заданным параметрам.");
        }
    }
    public void sortTripsByCost(){
        System.out.println("Сортировка по стоимости: ");
        for (int i = 0; i < trips.size() - 1; i++) {
            for (int j = i + 1; j < trips.size(); j++) {
                if (trips.get(i).getCost() > trips.get(j).getCost()) {
                    Trip temp = trips.get(i);
                    trips.set(i, trips.get(j));
                    trips.set(j, temp);
                }
            }
        }
        for(Trip trip : trips){
            System.out.println(trip + "\n");
        }
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trip> trips) {
        this.trips = trips;
    }
}
