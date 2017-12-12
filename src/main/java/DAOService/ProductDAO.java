package DAOService;

import productClass.Product;

import java.util.List;

public interface ProductDAO {

    List<Product> findProducts();
}
