package utils;

import java.io.Serializable;

public class IpHandler implements Serializable{

    private static IpHandler instance;

    private String serverIp;
    private String username;
    private String password;

    public void setServerInfos(String serverIp, String username, String password) {
        this.serverIp = serverIp;
        this.username = username;
        this.password = password;
    }

    public String getServerIp() {
        return serverIp;
    }

    public static IpHandler getInstance(){

        if(instance == null){
            instance = new IpHandler();
        }

        return instance;
    }

    public static void setinstance(IpHandler inst){
        instance = inst;
    }
}
