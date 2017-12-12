package productClass;

public class Product {

    private String name;

    private int quantity;

    private int price;

    public Product(String name, int quantity, int price){

        this.name = name;
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

    public String getName() {
        return name;
    }
}

