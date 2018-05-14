/*
Criado por: Herick Maciel Maia
Data: 13/05/18
*/

package com.topicos.aula.listener;

import com.topicos.comum.listener.InternalFrameListener;

import javax.swing.*;


public class AulaInternalListener extends InternalFrameListener {

    public AulaInternalListener(JButton btnCancelar, JButton btnCadastrar) {
        super(btnCancelar, btnCadastrar);
    }

    @Override
    public void btnCadastrar() {
        System.out.println("Cadastrar Pessoa");
    }

    @Override
    public void btnCancelar() {
        System.out.println("Cancela Pessoa");
    }
}

