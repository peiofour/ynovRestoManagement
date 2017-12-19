package utils;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.StatementContext;
import usersclass.Admin;
import usersclass.Gerant;
import usersclass.Gestionnaire;
import usersclass.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RequestHandler {

    public static RequestHandler instance;

    private Jdbi jdbi;

    public RequestHandler(){
        this.jdbi = ConnectionHandler.getInstance().getJdbi();
    }

    public static RequestHandler getInstance(){
        if(instance == null){
            instance = new RequestHandler();
        }
        return instance;
    }

    public List<User> getUsers(){
        List<User> names = jdbi.withHandle(handle ->
                handle.createQuery("select * from users")
                        .map(this::mapUser)
                        .list());
        return names;
    }

    private User mapUser(ResultSet resultSet, StatementContext statementContext) {
        String role = "";
        int id = 0;
        String mail = "";
        String password = "";
        String firstname = "";
        String lastname = "";
        try {
            role = resultSet.getString("role");
            id = Integer.parseInt(resultSet.getString("id"));
            mail = resultSet.getString("user");
            password = resultSet.getString("password");
            firstname = resultSet.getString("firstname");
            lastname = resultSet.getString("lastname");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        User user = null;

        switch(role){
            case "1": // Admin
                user = new Admin(id,firstname,lastname,mail,password);
                break;
            case "2": // Gerant
                user = new Gerant(id,firstname,lastname,mail,password);
                break;
            case "3": // Gestionnaire
                user = new Gestionnaire(id,firstname,lastname,mail,password);
                break;
        }
        return user;
    }

    // *******************************************************************************


    /*CREATE TABLE IF NOT EXISTS users (
            ID INT NOT NULL UNIQUE AUTO_INCREMENT,
            user VARCHAR(30) UNIQUE ,
    password VARCHAR(60),
    firstname VARCHAR(20),
    lastname VARCHAR(20),
    role INT NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (role) REFERENCES roles(ID)
            ) ENGINE=InnoDB;*/

    public void addUser(String password, String firstname, String lastname, int role, String mail){
        //int id, String firstname, String lastname, String email, String password
        jdbi.withHandle(handle -> {
            handle.createUpdate("INSERT INTO users(password,firstname,lastname,role,user) VALUES (:password, :firstname, :lastname, :role, :user)")
                    .bind("password", password)
                    .bind("firstname", firstname)
                    .bind("lastname", lastname)
                    .bind("role", role)
                    .bind("user", mail)
                    .execute();
            return null;
        });
    }
}
