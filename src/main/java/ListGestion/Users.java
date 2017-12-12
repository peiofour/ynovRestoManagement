package ListGestion;

import usersClass.User;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private List<User> users;

    public Users(){
        this.users = new ArrayList<>();
    }

    private void createUser(User user){
        this.users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
