package Classes.ClassesAndObjects.AggregationComposition.ex2;

public class Wheel {
    private boolean isFixed;

    Wheel(boolean isFixed){
        this.isFixed = isFixed;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }
}
