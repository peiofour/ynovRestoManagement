package productClass;

public class Product {

    private String nameproduct;

    private int quantity;

    private int price;

    public Product(String nameproduct, int quantity, int price){

        this.price = price;
        this.quantity = quantity;
        this.price = quantity;

        
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getNameproduct() {
        return nameproduct;
    }
}

