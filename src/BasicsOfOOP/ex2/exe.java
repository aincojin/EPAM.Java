package BasicsOfOOP.ex2;


public class exe {
    public static void main(String[] args) {
        double moneyLeft = 2000;
        Payment payment = new Payment(moneyLeft);

        payment.addProduct(payment.new Product("Стол", 700));
        payment.addProduct(payment.new Product("Стул", 400));
       // payment.addProduct(payment.new Product("Зеркало", 1300));


        payment.payForCart();

    }
}
