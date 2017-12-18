package restaurant;

import productClass.Product;
import usersClass.Gerant;

import javax.validation.constraints.NotBlank;
import java.util.List;

public class Store {

    private static String NAME_PATTERN = "%s %s %s";

    @NotBlank
    private String storeName;
    @NotBlank
    private String address;
    @NotBlank
    private Gerant gerant;
    @NotBlank
    private int phoneNumber;

    private List<Product> productList;

    public Store(String name, String address, Gerant gerant, int phoneNumber) {
        this.storeName = name;
        this.address = address;
        this.gerant = gerant;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return storeName;
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
