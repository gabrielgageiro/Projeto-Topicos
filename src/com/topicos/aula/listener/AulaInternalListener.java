/*
Criado por: Herick Maciel Maia
Data: 13/05/18
*/

package com.topicos.aula.listener;

import com.topicos.comum.listener.InternalFrameListener;
import com.topicos.logs.logsys.LogDeAcoes;

import javax.swing.*;


public class AulaInternalListener extends InternalFrameListener {

    public AulaInternalListener(JButton btnCancelar, JButton btnCadastrar) {
        super(btnCancelar, btnCadastrar);
    }

    @Override
    public void btnCadastrar() {
        LogDeAcoes.salvarLog("Cadastrar Aula");

    }

    @Override
    public void btnCancelar() {
        LogDeAcoes.salvarLog("cancelar Aula");

    }
}

