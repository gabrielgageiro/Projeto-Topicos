/*
Criado por Gabriel Gageiro;
Data:23/03/18
*/


package com.topicos.app;


import com.topicos.bancoDeDados.Banco;
import com.topicos.login.Login;

public class App {

    public static void main(String[] args) {

        Banco.getConexao();

        new Login();
    }

}
