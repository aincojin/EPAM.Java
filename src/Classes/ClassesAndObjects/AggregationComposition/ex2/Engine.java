package Classes.ClassesAndObjects.AggregationComposition.ex2;

public class Engine {
    private double volume;
    Engine(double volume){
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
