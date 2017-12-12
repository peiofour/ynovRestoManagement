package productClass;

public class product {

    private String nameproduct;

    private int quantity;

    private int price;

    public product(String nameproduct, int quantity, int price){

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

