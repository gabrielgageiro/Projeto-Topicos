/*
Criado por: Herick Maciel Maia
Data: 13/05/18
*/

package com.topicos.cadastro.aula.listener;

import com.topicos.cadastro.aula.AulaInternalFrame;
import com.topicos.comum.listener.InternalFrameListener;
import com.topicos.logs.logsys.LogDeAcoes;

import javax.swing.*;


public class AulaInternalListener extends InternalFrameListener {

    private AulaInternalFrame aulaInternalFrame;

    public AulaInternalListener(JButton btnCancelar, JButton btnCadastrar,AulaInternalFrame aulaInternalFrame) {
        super(btnCancelar, btnCadastrar);
        this.aulaInternalFrame=aulaInternalFrame;
        btnCadastrar.addActionListener(this);
        btnCancelar.addActionListener(this);
    }


    @Override
    public void btnCadastrar() {
        LogDeAcoes.salvarLog("Cadastrar Aula");
        System.out.println("aqui");

    }

    @Override
    public void btnCancelar() {


        LogDeAcoes.salvarLog("Cancelar Aula");

    }
}

