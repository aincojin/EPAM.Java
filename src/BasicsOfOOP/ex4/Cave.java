package BasicsOfOOP.ex4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cave {
    private ArrayList<Treasure> treasuresInside;

    Cave(){
        treasuresInside = new ArrayList<>(100);
    }

    public void addTreasure(){
        Treasure[] arr = {new Treasure("Браслет", 250), new Treasure("Кольцо", 250),
                new Treasure("Кольцо с рубином", 250), new Treasure("Кольцо с сапфиром", 300),
                new Treasure("Кольцо с алмазом", 350), new Treasure("Зелье здоровья", 100),
                new Treasure("Корона", 300), new Treasure("Брошь", 350),
                new Treasure("Кубок", 150), new Treasure("Колье", 300), new Treasure("Гнилой фрукт", 0),
                new Treasure("Магическая сфера", 4000)};

        for(int i = 0; i < 100; i++){
            Random random = new Random();
            int randomIndex = random.nextInt(arr.length);
            Treasure randomElement = arr[randomIndex];
            treasuresInside.add(randomElement);
        }
    }
    public void getMostValuableTreasure(){
        int max = Integer.MIN_VALUE;
        String max_treasure = "";
        for(Treasure treasure : treasuresInside){
            if(treasure.getValue() > max){
                max = treasure.getValue();
                max_treasure = treasure.getTreasureName();
            }
        }
        System.out.println("Самое ценное сокровище: " + max_treasure + ". Стоимость: " + max);
    }
    public void chooseTreasures() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму, на которую вы хотите набрать сокровищ: ");
        int wallet = in.nextInt();
        ArrayList<Treasure> inventory = new ArrayList<>();
        Random random = new Random();

        while (wallet > 0) {
            if (treasuresInside.isEmpty()) {
                System.out.println("Нет доступных сокровищ.");
                return;
            }

            int randomIndex = random.nextInt(treasuresInside.size());
            Treasure item = treasuresInside.get(randomIndex);

            if (item != null && item.getValue() <= wallet) {
                inventory.add(item);
                wallet -= item.getValue();
                treasuresInside.set(randomIndex, null);
            }

            if (wallet <= 0) {
                break;
            }
        }

        System.out.println("Сокровища в инвентаре:");
        int sum = 0;
        for (Treasure item : inventory) {
            sum+=item.getValue();
            System.out.println(item.getTreasureName() + "  " + item.getValue());
        }
        System.out.println(sum);
    }


    public void printTreasures(){
        for(Treasure treasure : treasuresInside){
            System.out.println(treasure);
        }
    }

    public ArrayList<Treasure> getTreasuresInside() {
        return treasuresInside;
    }

    public void setTreasuresInside(ArrayList<Treasure> treasuresInside) {
        this.treasuresInside = treasuresInside;
    }
}
