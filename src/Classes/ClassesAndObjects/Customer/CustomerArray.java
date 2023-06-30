package Classes.ClassesAndObjects.Customer;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class CustomerArray {
    private String customersGroup;
    private ArrayList<Customer> base;

    CustomerArray(String customersGroup, ArrayList<Customer> base) {
        this.customersGroup = customersGroup;
        this.base = base;
    }

    void sortName(){
        base.sort(Comparator.comparing(Customer::getLastName));
    }

    ArrayList<Customer> getCustomerByCreditCardRange(String min, String max){
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer customer : this.base) {
            if (customer.getCreditCardID().toString().compareTo(min) > 0
                    && customer.getCreditCardID().toString().compareTo(max) < 0) {
                list.add(customer);
            }
        }
        return list;
    }

    void addCustomer (int customerID, String lastName, String firstName, String patronymic, String address, BigInteger cardNumber, long bankAccountNumber){
        this.base.add(new Customer(customerID,lastName, firstName, patronymic, address, cardNumber, bankAccountNumber));
    }

    ArrayList<Customer> getBase() {
        return base;
    }

    public void setBase(ArrayList<Customer> base) {
        this.base = base;
    }

}