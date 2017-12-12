package usersClass;

public class Gestionnaire extends User {
    public Gestionnaire(int id, String firstname, String lastname, String email, String password) {
        super(id, firstname, lastname, email, password);
    }

    @Override
    public String getRole() {
        return "Gestionnaire";
    }
}
