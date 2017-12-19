package ressql;

import daoservice.RestaurantDAO;
import sqlservice.getRestaurant;
import restaurant.Store;

import java.util.List;

public class ResRestaurant {
    public  static void main(String[] args){
        RestaurantDAO restaurantDAO = new getRestaurant();
        List<Store> storeList = restaurantDAO.findStore();

        System.out.println("Store List");
        for(Store store : storeList){
            System.out.println(storeList);
        }
    }
}
