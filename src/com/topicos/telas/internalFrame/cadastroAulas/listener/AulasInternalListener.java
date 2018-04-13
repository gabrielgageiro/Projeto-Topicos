/*
Criado por Gabriel Gageiro;
Data:13/04/18
*/


package com.topicos.telas.internalFrame.cadastroAulas.listener;

import com.topicos.comum.listener.InternalFrameListener;

import javax.swing.*;

public class AulasInternalListener extends InternalFrameListener {
    public AulasInternalListener(JButton btnCadastrar, JButton btnCancelar) {
        super(btnCancelar, btnCadastrar);
    }

    @Override
    public void btnCadastrar() {
        System.out.println("Cadastro de Aulas");
    }

    @Override
    public void btnCancelar() {
        System.out.println("Cancelar de Aulas");
    }
}

