package az.commerce.entity;

public class Product {
    private int id;
    private String productName;
    private double price;


    public Product() {

    }
    public Product( int id , String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "productName='" + productName + '\'' +
                ", price=" + price;
    }
}
