package Classes.ClassesAndObjects.AggregationComposition.ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Auto {
    private boolean isFueled;
    private String model;
    private ArrayList<Wheel> wheels;
    private Engine engine;

    Auto(boolean isFueled, String model){
        this.isFueled = true;
        this.model = model;
        this.wheels = new ArrayList<>(4);
    }

   void printModel(){
       System.out.println(model);
   }
    void changeWheel(){
        for(int i = 0; i < wheels.size(); i++){
            if(!wheels.get(i).isFixed()){
                System.out.printf("%d колесо заменили.%n", i + 1);
                wheels.get(i).setFixed(true);
            }
        }
    }

    void refuel(){
        this.isFueled = true;
        System.out.println("Машина теперь заправлена.");
    }
    void drive(){
        int wheelCounter = 0;
        boolean isEngine = false;
        for(Wheel wheel : wheels){
           wheelCounter++;
        }
        if(wheelCounter == 0){
            System.out.println("Колеса не установлены.");
        } else if (wheelCounter > 0 && wheelCounter < 4) {
            System.out.println("Нескольких колес еще нет.");
        }
        if(engine == null){
            System.out.println("Двигатель не установлен.");
        }else{
            isEngine = true;
        }
        if(isEngine && wheelCounter == 4){
            boolean letsGo = true;
            for(int i = 0; i < wheels.size(); i++){
                if(!wheels.get(i).isFixed()){
                    System.out.printf("%d колесо машины испорчено. Замените," +
                            "а то не поедете.\n", i + 1);
                    letsGo = false;
                }else letsGo = true;
            }
            if(!isFueled){
                System.out.println("Заправьте машину.");
            } else if (letsGo) {
                System.out.println("Наконец-то я закончила с этим...");
            }
        }

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIsFueled(boolean fueled) {
        isFueled = fueled;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public boolean getIsFueled() {
        return isFueled;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }
    void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
        this.wheels = new ArrayList<>(Arrays.asList(w1, w2, w3, w4));
    }
}
