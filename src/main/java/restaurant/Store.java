package restaurant;

import productClass.Product;
import usersClass.Gerant;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class Store {

    @NotBlank
    private String name;
    @NotBlank
    private String address;
    @NotBlank
    private Gerant gerant;
    @NotBlank
    private int phoneNumber;

    private List<Product> productList;

    public Store(String name, String address, Gerant gerant, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.gerant = gerant;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Gerant getGerant() {
        return gerant;
    }
}
