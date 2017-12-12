package usersClass;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public abstract class User {

    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @NotBlank
    @Pattern(regexp = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b")
    private String email;
    @NotBlank
    private String password;




    public User(String _firstname, String _lastname, String _email, String _password){
        this.firstname = _firstname;
        this.lastname = _lastname;
        this.email = _email;
        this.password = _password;
    }
}
