/*
Criado por Herick Maciel Maia
Data: 14/05/18
*/

package com.topicos.pessoa.listener;

import com.topicos.comum.listener.InternalFrameListener;
import com.topicos.logs.logsys.LogDeAcoes;

import javax.swing.*;

public class PessoaInternalListener extends InternalFrameListener {

    public PessoaInternalListener(JButton btnCancelar, JButton btnCadastrar) {
        super(btnCancelar, btnCadastrar);
        btnCadastrar.addActionListener(this);
        btnCancelar.addActionListener(this);
    }

    @Override
    public void btnCadastrar() {
        LogDeAcoes.salvarLog("Cancelar Aula");
    }

    @Override
    public void btnCancelar() {
        LogDeAcoes.salvarLog("Cancelar Aula");

    }

}

