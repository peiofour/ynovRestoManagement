package resSQL;

import DAOService.UsersDAO;
import SQLService.getUsers;
import usersClass.User;

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
