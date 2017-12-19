package utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

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

    public Map<String, String> getServerIp() {
        Map<String, String> infos = new HashMap<>();
        infos.put("ip",serverIp);
        infos.put("username", username);
        infos.put("password", password);
        return infos;
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
