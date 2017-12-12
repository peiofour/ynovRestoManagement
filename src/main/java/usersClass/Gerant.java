package usersClass;

import restaurant.Store;

public class Gerant extends User {

    private Store store;

    public Gerant(int id, String firstname, String lastname, String email, String password) {
        super(id, firstname, lastname, email, password);
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getRole() {
        return "Gérant";
    }
}

