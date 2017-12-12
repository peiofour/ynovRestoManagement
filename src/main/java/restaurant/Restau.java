package restaurant;

public class Restau {
    private String nameRestau;
    private String adresseRestau;
    private String userGerant;
    private int phoneNumber;

    public Restau(String nameRestau, String adresseRestau, String userGerant, int phoneNumber) {
        this.nameRestau = nameRestau;
        this.adresseRestau = adresseRestau;
        this.userGerant = userGerant;
        this.phoneNumber = phoneNumber;
    }

    public String getNameRestau() {
        return nameRestau;
    }

    public String getLastname() {
        return adresseRestau;
    }

    public String getUserGerant() {
        return userGerant;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
