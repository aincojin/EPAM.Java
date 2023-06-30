package Classes.ClassesAndObjects.Customer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class Customer {
    private int customerID;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private BigInteger creditCardID;
    private long bankAccountID;

   Customer(int customerID, String lastName, String firstName,
                     String patronymic,String address,BigInteger creditCardID,
                     long bankAccountID) {
       this.customerID = customerID;
       this.lastName = lastName;
       this.firstName = firstName;
       this.patronymic = patronymic;
       this.address = address;
       this.creditCardID = creditCardID;
       this.bankAccountID = bankAccountID;
   }
    @Override
    public String toString(){
        return "\n\n" + customerID + "\n" + lastName + "\n" + firstName + "\n" +
                patronymic + "\n" + address + "\n" + creditCardID + "\n" +
                bankAccountID;
    }
    public static void main(String[] args) {
        CustomerArray client = new CustomerArray("clients", new ArrayList<>());

        client.addCustomer(1,"Иванов", "Иван", "Иванович",
                "Могилёв", new BigInteger("11111111111111"), 12345678);
        client.addCustomer(2,"Петрова", "Ника", "Сергеевна",
                "Минск", new BigInteger("22222222222222"), 23456789);
        client.addCustomer(3,"Самойлов", "Андрей", "Игоревич",
                "Гомель", new BigInteger("33333333333333"), 34567891);
        client.addCustomer(4,"Воробей", "Александра", "Антоновна",
                "Минск", new BigInteger("44444444444444"), 45678912);
        client.addCustomer(5,"Синкевич", "Варвара", "Игоревна",
                "Гродно", new BigInteger("55555555555555"), 56789123);

        System.out.println("\nСписок покупателей в алфавитном порядке:");
        client.sortName();
        for (int i = 0; i < client.getBase().size(); i++) {
            System.out.println(client.getBase().get(i));
        }

        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        ArrayList<Customer> list = client.getCustomerByCreditCardRange("30000000000000", "50000000000000");
        list.sort(Comparator.comparing(Customer::getCreditCardID));
        if (list.size() == 0) {
            System.out.println("Банковские карты не найдены");
        } else {
            for (Customer customer : list) {
                System.out.println(customer);
            }
        }
    }
    public int getCustomerIDId() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    BigInteger getCreditCardID() {
        return creditCardID;
    }

    public void setCardNumber(BigInteger creditCardID) {
        this.creditCardID = creditCardID;
    }

    public long getBankAccountID() {
        return bankAccountID;
    }

    public void setBankAccountID(long bankAccountID) {
        this.bankAccountID = bankAccountID;
    }
}
