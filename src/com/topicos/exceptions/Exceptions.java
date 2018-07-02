/*
Criado por Gabriel Gageiro;
Data:18/05/18
*/


package com.topicos.exceptions;

import javax.swing.*;

public class Exceptions extends Exception{
    public Exceptions(){
        super("Ocorreu um erro!");
        showWindow("Ocorreu um erro!");
    }
    public Exceptions(String msg){
        super(msg);
        showWindow(msg);
    }


    public void showWindow(String msg){
        JOptionPane.showMessageDialog(null,msg,"ERRO!",JOptionPane.ERROR_MESSAGE);
    }

}