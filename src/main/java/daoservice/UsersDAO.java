package daoservice;

import usersclass.User;

import java.util.List;

public interface UsersDAO {
    List<User> findUsers();
}
