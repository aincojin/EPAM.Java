package Classes.ClassesAndObjects.AggregationComposition.ex3;

import java.util.ArrayList;

public class Region {
    private String region;
    private City regionCenter;
    private double area;
    private ArrayList<District> districts;

    public Region(String region, City regionCenter, double area){
        this.region = region;
        this.regionCenter = regionCenter;
        this.area = area;
        this.districts = new ArrayList<>();
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }
}
