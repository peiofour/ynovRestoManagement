package ressql;

import daoservice.ProductDAO;
import sqlservice.getProduct;
import productclass.Product;

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
