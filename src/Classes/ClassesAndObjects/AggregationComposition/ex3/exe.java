package Classes.ClassesAndObjects.AggregationComposition.ex3;

public class exe {
    public static void main(String[] args) {
        City city1 = new City("Минск");
        Country country1 = new Country("Беларусь",city1);

        country1.addRegion(new Region("Минская", city1, 39.854));
        country1.addRegion(new Region("Гродненская", new City("Гродно"), 25.127));
        country1.addRegion(new Region("Гомельская", new City("Гомель"), 29.068));
        country1.addRegion(new Region("Могилёвская", new City("Могилёв"), 40.372));
        country1.addRegion(new Region("Витебская", new City("Витебск"), 40.051));
        country1.addRegion(new Region("Брестская", new City("Брест"), 32.787));

        country1.printCapital();
        country1.countRegions();
        country1.printArea();
        country1.printRegionCenter();
    }
}
