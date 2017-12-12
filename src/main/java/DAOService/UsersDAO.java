package DAOService;

import usersClass.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UsersDAO {
    List<User> findUsers();
}
