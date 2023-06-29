//класс, реализующий десятичный счетчик

package Classes.ClassesAndObjects;

import java.util.Random;

public class Counter {

    private int num;

    /*private Counter(int num){
        this.num = num;
    }*/
    private Counter(){
        num = 0;
    }
    private static void randomCounter(Counter counter){
        Random rnd = new Random();
        counter.num = rnd.nextInt(30) + 1;
    }
    private static void makeGrater(Counter counter){
        counter.num++;
        System.out.println("count++");
    }
    private static void makeLess(Counter counter){
        counter.num--;
        System.out.println("count--");
    }
    private static void currentState(Counter counter){
        System.out.printf("Текущее значение счетчика: %d%n",counter.num);
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.printf("Значение счетчика по умолчанию: %d%n", counter.num);
        randomCounter(counter);
        System.out.printf("Произвольное значение счетчика: %d%n", counter.num);
        makeGrater(counter);
        makeGrater(counter);
        makeLess(counter);
        currentState(counter);
    }

}
