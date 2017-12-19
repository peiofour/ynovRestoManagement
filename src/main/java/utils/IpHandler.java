package utils;

import java.io.Serializable;

public class IpHandler implements Serializable{

    private static IpHandler instance;

    private String serverIp;

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
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
