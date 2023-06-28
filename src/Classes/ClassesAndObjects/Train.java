/*Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте  возможность  сортировки  массива  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
назначения должны быть упорядочены по времени отправления.*/

package Classes.ClassesAndObjects;

import java.util.Scanner;

public class Train {
    private String destination;
    private int trainId;
    private String arrivalTime;

    private Train(String destination, int trainId, String arrivalTime) {
        this.destination = destination;
        this.trainId = trainId;
        this.arrivalTime = arrivalTime;
    }

    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Мюнхен", 111, "12:21");
        trains[1] = new Train("Мюнхен", 210, "21:10");
        trains[2] = new Train("Гамбург", 227, "13:56");
        trains[3] = new Train("Ташкент", 250, "09:09");
        trains[4] = new Train("Брюссель", 374, "11:15");

        sortTrainsById(trains);
        userTrain(trains);
        sortByDestination(trains);
    }
    public static void sortByDestination(Train[] trains){
        System.out.println("\nСортировка по месту назначения: ");
        Train temp;
        Train timeTemp;
        for(int i = 0; i < trains.length; i++){
            for(int j = trains.length - 1; j > i; j--){
                if(trains[i].destination.compareTo(trains[j].destination) > 0){
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }else if(trains[i].destination.compareTo(trains[j].destination) == 0){
                    if(trains[i].arrivalTime.compareTo(trains[j].arrivalTime) > 0){
                        timeTemp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = timeTemp;
                    }
                }
            }
        }
        for(Train train : trains){
            System.out.printf("%s     %d     %s%n", train.destination,train.trainId, train.arrivalTime);
        }

    }

    public static void userTrain(Train[] trains){
        Scanner in = new Scanner(System.in);
        boolean trainExists = false;
        System.out.print("\nВведите номер поезда: ");
        int u = in.nextInt();
        for(Train train : trains) {
            if (train.trainId == u) {
                System.out.printf("%s     %d     %s%n",train.destination, train.trainId, train.arrivalTime);
                trainExists = true;
            }
        }
        if(!trainExists){
            System.out.println("Поезда с таким номером нет. :`(");
        }

    }

    public static void sortTrainsById(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].trainId > trains[j].trainId) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
        for(Train train : trains){
            System.out.printf("%s     %d     %s%n", train.destination,train.trainId, train.arrivalTime);
        }
    }


}
