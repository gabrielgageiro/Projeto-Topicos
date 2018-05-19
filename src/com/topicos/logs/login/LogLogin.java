/*
Criado por Gabriel Gageiro;
Data:08/05/18
*/


package com.topicos.logs.login;

import java.io.*;

public class LogLogin {

    private LogLogin(){}

    public static void salvar(String user){

        try {
            FileOutputStream fos = new FileOutputStream("user.log");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user);
            oos.flush();
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String lerUsuario() {

        File file = new File("user.log");
        if (!file.exists()) {
            try {

                new File("user.log").createNewFile();
                return "";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileInputStream fis = new FileInputStream("user.log");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Object obj = ois.readObject();
            fis.close();
            return (String) obj;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }

        return null;
    }
}

