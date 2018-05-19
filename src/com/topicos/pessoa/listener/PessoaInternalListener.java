/*
Criado por Herick Maciel Maia
Data: 14/05/18
*/

package com.topicos.pessoa.listener;

import com.topicos.comum.listener.InternalFrameListener;

import javax.swing.*;

public class PessoaInternalListener extends InternalFrameListener {

    public PessoaInternalListener(JButton btnCancelar, JButton btnCadastrar) {
        super(btnCancelar, btnCadastrar);
    }

    @Override
    public void btnCadastrar() {
        System.out.println("Cadastrar Pessoa");
    }

    @Override
    public void btnCancelar() {
        System.out.println("Cancelar Pessoa");
    }

}

