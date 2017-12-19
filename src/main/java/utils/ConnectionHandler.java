package utils;

import org.jdbi.v3.core.Jdbi;

import java.io.Serializable;

public class ConnectionHandler implements Serializable{

    private static ConnectionHandler instance;

    private Jdbi jdbi;

    public void setServerInfos(String serverIp,String port, String dbname, String username, String password) {
        jdbi = Jdbi.create("jdbc:mysql://"+serverIp+":"+port+"/"+dbname, username, password);
    }

    public Jdbi getJdbi() {
        return jdbi;
    }


    public static ConnectionHandler getInstance(){

        if(instance == null){
            instance = new ConnectionHandler();
        }

        return instance;
    }

    public static void setInstance(ConnectionHandler inst){
        instance = inst;
    }
}
