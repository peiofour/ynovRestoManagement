package ListGestion;

import restaurant.Store;
import usersClass.Gerant;

import java.util.ArrayList;
import java.util.List;

public class Stores {

    private List<Store> stores;

    public Stores(){
        this.stores = new ArrayList<>();
    }

    private void addStore(Store store, Gerant gerant){
        this.stores.add(store);
        gerant.setStore(store);
    }

    public List<Store> getStores() {
        return stores;
    }
}
