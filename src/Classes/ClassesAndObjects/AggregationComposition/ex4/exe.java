package Classes.ClassesAndObjects.AggregationComposition.ex4;


import java.util.ArrayList;

public class exe {
    public static void main(String[] args) {
        Account account1 = new Account(1, false,-300);
        Account account2 = new Account(2, false,100);
        Account account3 = new Account(3, true,800);
        Account account4 = new Account(4, true,1040);
        Account account5 = new Account(5, false, -240);
        Account account6 = new Account(6, false,580);

        ArrayList<Account> accounts1 = new ArrayList<>();
        accounts1.add(account1);
        accounts1.add(account2);
        accounts1.add(account3);

        ArrayList<Account> accounts2 = new ArrayList<>();
        accounts2.add(account4);
        accounts2.add(account5);
        accounts2.add(account6);

        Client client1 = new Client(1,"Авраамова Надежда Сергеевна");
        client1.setAccounts(accounts1);

        Client client2 = new Client(2,"Лазарев Сергей Валентинович");
        client2.setAccounts(accounts2);

        client2.getSumFromAllAccounts();
        client1.getSumFromAllNegativeAccounts();
        client1.getSumFromAllPositiveAccounts();
        client1.findAccount(2);
        client1.sortByBalance();
    }



}
