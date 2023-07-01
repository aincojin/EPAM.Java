package Classes.ClassesAndObjects.AggregationComposition.ex5;

public class Trip {
    private int tripId;
    private String tripType;
    private String transportation;
    private boolean isFood;
    private Integer duration;
    private Integer cost;

    Trip(int tripId, String tripType, String transportation, boolean isFood, Integer duration, Integer cost){
        this.tripId = tripId;
        this.tripType = tripType;
        this.transportation = transportation;
        this.isFood = isFood;
        this.duration = duration;
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "ID путевки: " + tripId + "\nТип: " + tripType + "\nВид транспорта: " + transportation +
                "\nПитание включено в стоимость: " + isFood + "\nДлительность: " + duration +
                "\nСтоимость: " + cost;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public boolean getIsFood() {
        return isFood;
    }

    public void setIsFood(boolean food) {
        isFood = food;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
