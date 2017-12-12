package usersClass;

public class Gerant extends User {

    public Gerant(int id, String firstname, String lastname, String email, String password) {
        super(id, firstname, lastname, email, password);
    }

    public String getRole() {
        return "Gérant";
    }
}

