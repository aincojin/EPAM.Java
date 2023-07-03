package BasicsOfOOP.ex2;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Product> cart;
    private double moneyLeft;

    Payment(double moneyLeft){
    this.moneyLeft = moneyLeft;
       cart = new ArrayList<>();
    }

    public void addProduct(Product product){
        cart.add(product);
    }

    public void payForCart(){

        double sumPrice = 0;
        System.out.print("В корзине: ");
        for (Product product : cart){
            System.out.print(product.getProduct() + " ");
            sumPrice += product.getPrice();
        }
        System.out.println("\nК оплате: " + sumPrice);
        if(moneyLeft >= sumPrice) {
            System.out.println("Покупка оплачена.");
            emptyCart(cart);
        }else {
            System.out.println("Недостаточно денег для покупки.");
        }
    }
    public void emptyCart(ArrayList<Product> cart){
        cart.clear();
        System.out.println("Корзина пуста.");
    }
    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public double getMoneyLeft() {
        return moneyLeft;
    }

    public void setMoneyLeft(double moneyLeft) {
        this.moneyLeft = moneyLeft;
    }

    public class Product {
        private String product;
        private double price;
        Product(String product, double price){
            this.price = price;
            this.product = product;
        }
        @Override
        public String toString(){
            return "Продукт: " + product + "\nЦена: " + price + "\n";
        }
        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

}
