/*
Criado por Herick Maciel Maia
Data: 14/05/18
*/

package com.topicos.cadastro.pessoa.listener;

import com.topicos.comum.listener.InternalFrameListener;
import com.topicos.logs.logsys.LogDeAcoes;
import com.topicos.cadastro.pessoa.PessoaInternalFrame;

public class PessoaInternalListener extends InternalFrameListener {

    private PessoaInternalFrame pessoaInternalFrame;

    public PessoaInternalListener(PessoaInternalFrame pessoaInternalFrame) {
        super(pessoaInternalFrame.getBtnCancelar(), pessoaInternalFrame.getCadastrarBtn());
        this.pessoaInternalFrame=pessoaInternalFrame;
    }


    @Override
    public void btnCadastrar() {
        LogDeAcoes.salvarLog("Cadastrar Aula");
        pessoaInternalFrame.salvarDados();

    }

    @Override
    public void btnCancelar() {
        LogDeAcoes.salvarLog("Cancelar Aula");
        pessoaInternalFrame.dispose();

    }

}

