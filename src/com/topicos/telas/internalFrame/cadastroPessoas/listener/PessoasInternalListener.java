/*
Criado por Gabriel Gageiro;
Data:13/04/18
*/


package com.topicos.telas.internalFrame.cadastroPessoas.listener;

import com.topicos.comum.listener.InternalFrameListener;

import javax.swing.*;


public class PessoasInternalListener extends InternalFrameListener {

    public PessoasInternalListener(JButton btnCadastrar, JButton btnCancelar) {
        super(btnCancelar,btnCadastrar);
    }

    @Override
    public void btnCadastrar() {
        System.out.println("Cadastrar de Pessoas");
    }

    @Override
    public void btnCancelar() {
        System.out.println("Cancelar de Pessoas");
    }
}





