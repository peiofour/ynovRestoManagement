package utils;

import org.jdbi.v3.core.Jdbi;

import java.io.Serializable;

public class ConnectionHandler implements Serializable{

    private static ConnectionHandler instance;

    private String host;
    private String username;
    private String password;

    public void setServerInfos(String serverIp,String port, String dbname, String username, String password) {
        this.host = "jdbc:mysql://"+serverIp+":"+port+"/"+dbname;
        this.username = username;
        this.password = password;
        FileManager.serializeObject(instance);
    }

    public Jdbi getJdbi() {
        return Jdbi.create(host,username,password);
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
