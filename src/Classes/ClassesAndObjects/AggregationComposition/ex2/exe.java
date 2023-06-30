package Classes.ClassesAndObjects.AggregationComposition.ex2;

public class exe {
    public static void main(String[] args) {
        Auto auto = new Auto(true, "Hyundai KONA");
        System.out.printf("Машина модели %s выезжает.%n", auto.getModel());
        auto.drive();

        Engine engine1 = new Engine(2.0);
        auto.setEngine(engine1);
        System.out.printf("Установлен двигатель объемом %f литров." +
                "Машина выезжает.%n", engine1.getVolume());

        auto.drive();
        auto.setWheels(new Wheel(true), new Wheel(false), new Wheel(true), new Wheel(true));
        System.out.printf("Установлены колеса. Машина выезжает%n");


        auto.changeWheel();
        auto.refuel();
        auto.drive();
        auto.printModel();
    }
}
