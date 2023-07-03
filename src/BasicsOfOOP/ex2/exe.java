package BasicsOfOOP.ex2;

import java.util.ArrayList;

public class exe {
    public static void main(String[] args) {
        Product prod1 = new Product("Стол", 700);
        Product prod2 = new Product("Стул", 400);
        Product prod3 = new Product("Зеркало", 1300);

        ArrayList<Product> products = new ArrayList<>();

        products.add(prod2);
        products.add(prod3);

        Payment payment = new Payment(new ArrayList<>(), 2000);

        payment.payForCart(products);

    }
}
