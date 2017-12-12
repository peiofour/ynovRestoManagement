package productClass;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Product {

    @NotBlank
    private String name;
    @Min(0)
    private int quantity;
    @Min(0)
    private int price;

    public Product(String name, int quantity, int price){

        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

