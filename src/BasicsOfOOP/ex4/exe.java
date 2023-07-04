package BasicsOfOOP.ex4;

import java.util.Scanner;

public class exe {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Cave cave = new Cave();
        cave.addTreasure();
        String start = """
                Выберите вариант из предложенных и введите его номер:
                1) Просмотреть сокровища.
                2) Найти самое ценное сокровище.
                3) Выбрать сокровища на 5000 золота.
                4) Завершить работу.
                """;
        String choice;
        System.out.println(start);

       Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите номер варианта:");
            choice = in.next();
            switch (choice) {
                case "1" -> cave.printTreasures();
                case "2" -> cave.getMostValuableTreasure();
                case "3" -> cave.chooseTreasures();
                case "4" -> System.out.println("\nВы вышли.");
                default -> System.out.println("Такого варианта нет.");

            }
        } while (!choice.equals("4"));
    }


}
