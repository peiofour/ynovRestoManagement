/*package SQLService;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;

public class ConnectSQL {

public static void main(String[] args){

    String url = "jdbc:mysql://localhost/phpmyadmin/db_structure.php?server=1&db=users";
    String utilisateur = "root";
    String motDePasse = "";

    Handle handle = DBI.open("", "", "");
    handle.createQuery("SELECT * FROM users_t WHERE id = :id")
            .bind("id", 12)
            .map(getUsers.class)
            .list();




}
}*/
