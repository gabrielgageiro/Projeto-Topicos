/*
Criado por Gabriel Gageiro;
Data:06/04/18
*/


package com.topicos.telas.frames.principalFrame.listenner;

import com.topicos.comum.listener.PrincipalListenner;

import com.topicos.logs.logsys.LogDeAcoes;

import javax.swing.*;

public class ListennerPrincipalFrame extends PrincipalListenner {

    private JFrame tp;

    public ListennerPrincipalFrame(JMenuItem SobreItem,JButton logoff,JButton sair,JFrame tp){
        super(SobreItem,logoff,sair);
        this.tp=tp;
    }


    @Override
    public void logoff() {
        tp.dispose();
        LogDeAcoes.salvarLog("Logoff");
    }

    @Override
    public void sair() {
        tp.dispose();
        LogDeAcoes.salvarLog("sair");
    }

    @Override
    public void sobreItem() {
        {
            String a = "<html>"+"<h2>Trabalho de Topicos Especiais I.</h2>"+
            "<p>ERP para Escola de Idiomas</p>"+"Desenvolvido por Gabriel, Herick, Marcelo"+"</html>";

            JOptionPane.showMessageDialog(null,a,"AJUDA",JOptionPane.INFORMATION_MESSAGE);
            LogDeAcoes.salvarLog("Sobre Item");
        }
    }
}
