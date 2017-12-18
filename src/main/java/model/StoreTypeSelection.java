package model;

import restaurant.Store;

public class StoreTypeSelection {

    private String name;
    private Class<? extends Store> clazz;

    public StoreTypeSelection(String name, Class<? extends Store> clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public Class<? extends Store> getClazz() {
        return clazz;
    }

}
