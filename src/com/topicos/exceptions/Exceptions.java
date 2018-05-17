package com.topicos.exceptions;

public class Exceptions extends Exception{
    public Exceptions(){
        super("Ocorreu um erro!");
    }
    public Exceptions(String msg){
        super(msg);
    }

}

