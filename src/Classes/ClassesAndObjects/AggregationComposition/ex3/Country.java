package Classes.ClassesAndObjects.AggregationComposition.ex3;

import java.util.ArrayList;

public class Country {
    private String country;
    private City capital;
    private ArrayList<Region> regions;

    Country(String country, City capital){
        this.country = country;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }
    void printCapital(){
        System.out.printf("Столицей страны %s является %s%n", country, capital);
    }
    void countRegions(){
        int count = 0;
        for(Region region : regions){
            count++;
        }
        System.out.printf("В %s %d областей%n", country,count);
    }
    void addRegion(Region region){
        this.regions.add(region);

    }
    void printArea(){
        int fullArea=0;
        for(Region region : regions){
            fullArea += region.getArea();
        }
        System.out.printf("Площадь страны %s составляет %d км2%n", country, fullArea);
    }
    void printRegionCenter(){
        for(Region region : regions){
            System.out.printf("%s - областной центр %s области%n", region.getRegionCenter(), region.getRegion());
        }
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }
}
