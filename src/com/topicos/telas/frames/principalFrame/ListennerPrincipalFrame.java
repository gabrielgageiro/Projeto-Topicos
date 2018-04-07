/*
Criado por Gabriel Gageiro;
Data:06/04/18
*/


package com.topicos.telas.frames.principalFrame;

import com.topicos.listenners.PrincipalListenner;
import com.topicos.telas.frames.principalFrame.Principal;

import javax.swing.*;

public class ListennerPrincipalFrame extends PrincipalListenner {


    public ListennerPrincipalFrame(JButton btnCadastrar,JMenuItem SobreItem){
        super(SobreItem,btnCadastrar);
    }

    @Override
    public void btnCadastrar() {
        
   }

    @Override
    public void sobreItem() {
        {
            String a = "<html>"+"<h2>Trabalho de Topicos Especiais I.</h2>"+
            "<p>ERP para bibliotecas</p>"+"Desenvolvido por Erick, Gabriel, Marcelo"+"</html>";

            JOptionPane.showMessageDialog(null,a,"AJUDA",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
