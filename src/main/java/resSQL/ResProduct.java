package resSQL;

import DAOService.ProductDAO;
import DAOService.UsersDAO;
import SQLService.getProduct;
import SQLService.getUsers;
import productClass.Product;

import java.util.List;

public class ResProduct {

    public static void main (String[] args){
        ProductDAO productdao = new getProduct();
        List<Product> productsList = productdao.findProducts();

        System.out.println("List Products");
        for (Product product: productsList){
            System.out.println(product);
        }
    }
}
