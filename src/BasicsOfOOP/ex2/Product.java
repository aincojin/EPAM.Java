package BasicsOfOOP.ex2;

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
