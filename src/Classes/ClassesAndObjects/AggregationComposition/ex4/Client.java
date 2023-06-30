    package Classes.ClassesAndObjects.AggregationComposition.ex4;

    import java.util.ArrayList;

    public class Client {
        private int clientId;
        private String fullName;


        private ArrayList<Account> accounts;

        Client( int clientId,String fullName){

            this.clientId = clientId;
            this.fullName = fullName;
            this.accounts = new ArrayList<>();

        }
        void printAccounts(){
           System.out.println(accounts);
        }

        void sortByBalance(){
           System.out.println("Сортировка по балансу: ");
           for (int i = 0; i < accounts.size() - 1; i++) {
               for (int j = i + 1; j < accounts.size(); j++) {
                   if (!accounts.get(i).getIsBlocked() && !accounts.get(j).getIsBlocked()
                           && accounts.get(i).getGold() < accounts.get(j).getGold()) {
                       Account temp = accounts.get(i);
                       accounts.set(i, accounts.get(j));
                       accounts.set(j, temp);
                   }
               }
           }
           for (Account account : accounts) {
               if (!account.getIsBlocked()){
                   System.out.println("Номер счета : " + account.getAccountId() + "\nБаланс : " + account.getGold());
               }
           }
        }
        void findAccount(int num) {
            boolean found = false;
            for (Account account : accounts) {
                  if (account.getAccountId() == num && !account.getIsBlocked()) {
                      System.out.println("Номер счета : " + account.getAccountId() + "\nБаланс : " + account.getGold());
                      found = true;
                  }
            }
           if(!found) System.out.println("Нет такого счета либо он заблокирован.");
        }

        void getSumFromAllAccounts(){
           int sum = 0;
           for(Account account : accounts){
               if(!account.getIsBlocked()) {
                   sum += account.getGold();
               }else{
                   System.out.printf("Счет №%d заблокирован.%n", account.getAccountId());
               }
           }
           System.out.printf("Общая сумма со всех незаблокированных счетов составляет " + sum + "\n");
        }

        void getSumFromAllNegativeAccounts(){
            int sum = 0;
            for(Account account : accounts){
                if(!account.getIsBlocked() && account.getGold() < 0) {
                    sum += account.getGold();
                }else if(account.getIsBlocked()){
                    System.out.printf("Счет №%d заблокирован.%n", account.getAccountId());
                }
            }
            System.out.printf("Общая сумма со всех незаблокированных счетов с негативным балансом составляет " + sum + "\n");
        }
        void getSumFromAllPositiveAccounts(){
            int sum = 0;
            for(Account account : accounts){
                if(!account.getIsBlocked() && account.getGold() > 0) {
                    sum += account.getGold();
                }else if(account.getIsBlocked()){
                    System.out.printf("Счет №%d заблокирован.%n", account.getAccountId());
                }
            }
            System.out.printf("Общая сумма со всех незаблокированных счетов с положительным балансом составляет " + sum + "\n");
        }
        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public void setAccounts(ArrayList<Account> accounts) {
            this.accounts = accounts;
        }

        public ArrayList<Account> getAccounts() {
            return accounts;
        }

        public int getClientId() {
            return clientId;
        }

        public void setClientId(int clientId) {
            this.clientId = clientId;
        }
    }
