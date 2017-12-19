package listgestion;

import restaurant.Store;

import java.util.ArrayList;
import java.util.List;

public class Stores {

    public List<Store> stores;
    public static Stores instance;

    public Stores(){
        this.stores = new ArrayList<>();
    }

    public void addStore(Store store){
        this.stores.add(store);
    }

    public List<Store> getStores() {
        return stores;
    }

    public static Stores getInstance(){
        if(instance == null){
            instance = new Stores();
        }
        return instance;
    }

}
