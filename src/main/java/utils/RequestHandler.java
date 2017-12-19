package utils;

import org.jdbi.v3.core.Jdbi;

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

    public String[] getUsers(){
        
    }
}
