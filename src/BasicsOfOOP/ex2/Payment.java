package BasicsOfOOP.ex2;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Product> cart;
    private double moneyLeft;

    Payment(ArrayList<Product> cart, double moneyLeft){
        this.moneyLeft = moneyLeft;
        this.cart = cart;
    }

    public void payForCart(ArrayList<Product> cart){

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
}
