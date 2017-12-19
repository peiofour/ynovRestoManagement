package usersclass;

public class Admin extends User {

    public Admin(int id, String firstname, String lastname, String email, String password) {
        super(id, firstname, lastname, email, password);
    }

    public String getRole() {
        return "Administrateur";
    }
}
