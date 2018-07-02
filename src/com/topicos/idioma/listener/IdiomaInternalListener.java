/*
Criado por: Herick Maciel Maia
Data: 13/05/18
*/

package com.topicos.idioma.listener;

import com.topicos.comum.listener.InternalFrameListener;
import com.topicos.logs.logsys.LogDeAcoes;

import javax.swing.*;


public class IdiomaInternalListener extends InternalFrameListener {

    public IdiomaInternalListener(JButton btnCancelar, JButton btnCadastrar) {
        super(btnCancelar, btnCadastrar);
        btnCadastrar.addActionListener(this);
        btnCancelar.addActionListener(this);
    }

    @Override
    public void btnCadastrar() {
        LogDeAcoes.salvarLog("Cadastrar Idioma");
        System.out.println("CADASSTRAR");

    }

    @Override
    public void btnCancelar() {
        LogDeAcoes.salvarLog("Cancelar Idioma");
        System.out.println("SAIU");


    }
}

