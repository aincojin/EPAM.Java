package Classes.ClassesAndObjects.AggregationComposition.ex3;

public class City {
    private String city;

    City(String city){
        this.city = city;
    }
    @Override
    public String toString(){
        return city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
