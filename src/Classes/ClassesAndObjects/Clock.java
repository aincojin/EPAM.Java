package Classes.ClassesAndObjects;

import java.util.Scanner;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    private Clock(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    /*private Clock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }*/

    public static void main(String[] args) {
        Clock clock = new Clock();
        changeHour(clock);
        changeMinute(clock);
        changeSecond(clock);
        System.out.printf("На часах: %d часов %d минут %d секунд%n", clock.hour, clock.minute, clock.second);
        specificTime(clock);
        setTime(clock);

    }
    public static void changeHour(Clock clock){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        clock.hour = in.nextInt();
        if(clock.hour >= 24 || clock.hour < 0){
            clock.hour = 0;
        }
    }
    public static void changeMinute(Clock clock){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество минут: ");
        clock.minute = in.nextInt();

        if(clock.minute >= 60 || clock.minute < 0){
            clock.minute = 0;
        }

    }
    public static void changeSecond(Clock clock){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        clock.second = in.nextInt();
        if(clock.second >= 60 || clock.second < 0){
            clock.second = 0;
        }
    }
    //я не поняла последнюю часть задания,так что сделаю оба варианта:)
    public static void specificTime(Clock clock){
        clock.hour = 23;
        clock.minute = 23;
        clock.second = 23;
        System.out.println("\nВремя установлено на 23 час 23 минуту и 23 секунду.");
    }
    private static void setTime(Clock clock){
        System.out.println("\nУвеличим время на 4 часа 50 минут и 39 секунды.");
        int h = 4;
        int m = 50;
        int s = 39;
        if(clock.hour + h == 24){
            clock.hour = 0;
        }else if (clock.hour + h > 24){
            int left = 24 - clock.hour;
            clock.hour = h - left;
        }else{
            clock.hour += h;
        }

        if(clock.minute + m == 60){
            clock.minute = 0;
            clock.hour++;
        }else if (clock.minute + m > 60){
            int left = 60 - clock.minute;
            clock.minute = m - left;
            clock.hour++;
        }else{
            clock.minute += m;
        }


        if(clock.second + s == 60){
            clock.second = 0;
            clock.minute++;
        }else if (clock.second + s > 60){
            int left = 60 - clock.second;
            clock.second = s - left;
            clock.minute++;
        }else{
            clock.second += s;
        }

        System.out.printf("После изменений на часах: %d часов %d минут %d секунд%n", clock.hour, clock.minute, clock.second);
    }

}
