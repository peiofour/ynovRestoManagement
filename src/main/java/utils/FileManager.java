package utils;

import java.io.*;

public class FileManager {


    public static void serializeObject(Object obj){
        try {
            FileOutputStream fileOut = new FileOutputStream("ip.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in ip.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static Object deserializeObject(String filePath){
        Object obj = new Object();
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj = in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("class not found");
            c.printStackTrace();
        }
        return obj;
    }

    public static boolean checkIfFileExists(String filename){
        File f = new File(filename);
        if(f.exists() && !f.isDirectory()) {
            System.out.println(filename + " exists !");
            return true;
        }
        return false;
    }




}
