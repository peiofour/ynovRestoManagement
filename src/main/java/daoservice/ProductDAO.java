package daoservice;

import productclass.Product;

import java.util.List;

public interface ProductDAO {

    List<Product> findProducts();
}
