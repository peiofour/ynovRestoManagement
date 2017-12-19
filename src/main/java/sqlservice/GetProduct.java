package sqlservice;


import daoservice.ProductDAO;
import org.jdbi.v3.core.Jdbi;


import java.util.List;

public class GetProduct implements ProductDAO {
    Jdbi jdbi = Jdbi.create("jdbc:mysql://10.31.0.188:3306/store_management", "root", "Tal33z");




    public List<String> findProducts() {

        List<String> productsList = jdbi.withHandle(handle -> {
                /*handle.execute("INSERT INTO stores(gerant_id, name, phone) VALUES (5, 'Macdo', '051010101010')");*/
               /* handle.execute("INSERT INTO users(user ,password , firstname, lastname, role) VALUES ('rachidYnov', 'Medlethug', 'Rachid', 'Rondoudou','1')");*/
                /*handle.execute("INSERT INTO products(name, quantity, price) VALUES ('tomates', '200', 5)");
                handle.createQuery("SELECT * FROM users")
                    .mapTo(String.class)
                    .list();
                handle.createQuery("SELECT * FROM stores")
                    .mapTo(String.class)
                    .list();
                 handle.createQuery("SELECT user FROM products")
                    .mapTo(String.class)
                    .list();
            handle.execute("INSERT INTO users(user ,password , firstname, lastname, role) VALUES ('rachidYnov', 'Medlethug', 'Rachid', 'Rondoudou','1') WHERE user !=");
*/

           return handle.createQuery("SELECT gerant_id FROM stores")
                    .mapTo(String.class)
                    .list();
        });


    System.out.println("Store"+ productsList);

    return productsList;
    }

}
