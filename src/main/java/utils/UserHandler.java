package utils;

public class UserHandler {

    public static UserHandler instance;

    public String role;

    public static UserHandler getInstance(){
        if(instance == null ){
            instance = new UserHandler();
        }
        return instance;
    }
}
