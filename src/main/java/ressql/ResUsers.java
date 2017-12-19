package ressql;

import daoservice.UsersDAO;
import sqlservice.getUsers;
import usersclass.User;

import java.util.List;

public class ResUsers {
    public  static void main (String[] args){
        UsersDAO usersdao = new getUsers();
        List<User> userList = usersdao.findUsers();

        System.out.println("List Users");
        for (User user : userList){
            System.out.println(userList);
        }
    }
}
