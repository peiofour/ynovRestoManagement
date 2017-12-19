package usersclass;

import org.mindrot.jbcrypt.BCrypt;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public abstract class User {

    private static String NAME_PATTERN = "%s %s %s";

    @NotBlank
    private int ID;
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @NotBlank
    @Pattern(regexp = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b")
    private String email;
    @NotBlank
    private String password;

    public User(){

    }

    public User(int id, String firstname, String lastname, String email, String password){
        this.ID = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public String getName(){
        return String.format(NAME_PATTERN, getRole(), firstname, lastname);
    }

    public Boolean verifyPassword(String _password){
        return BCrypt.checkpw(_password, this.password);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getLastname() {
        return lastname;
    }

    public abstract String getRole();

    public String getFullName() {
        return firstname + " " + lastname;
    }
}
