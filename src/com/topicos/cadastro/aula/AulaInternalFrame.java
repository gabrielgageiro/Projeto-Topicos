/*
Criado por: Herick Maciel Maia
Data: 13/05/18
*/

package com.topicos.cadastro.aula;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AulaInternalFrame extends JInternalFrame {

    private JComboBox idiomaCbx;
    private JComboBox professorCbx;
    private JComboBox alunoCbx;
    private JComboBox periodoCbx;
    private JButton btnCancelar;
    private JButton btnCadastrar;

    public AulaInternalFrame() {
        setClosable(true);
        setTitle("Cadastro de Turmas");
        setBounds(100, 100, 285, 280);
        getContentPane().setLayout(null);

        JLabel lblIdioma = new JLabel("Idioma:");
        lblIdioma.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblIdioma.setBounds(30, 30, 70, 14);
        getContentPane().add(lblIdioma);

        JLabel lblProfessor = new JLabel("Professor:");
        lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblProfessor.setBounds(30, 75, 70, 14);
        getContentPane().add(lblProfessor);

        JLabel lblAluno = new JLabel("Aluno:");
        lblAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblAluno.setBounds(30, 120, 70, 14);
        getContentPane().add(lblAluno);

        JLabel lblPeriodo = new JLabel("Período:");
        lblPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPeriodo.setBounds(30, 165, 70, 14);
        getContentPane().add(lblPeriodo);

        idiomaCbx = new JComboBox();
        idiomaCbx.setBounds(110, 29, 130, 20);
        //Modificar com o Banco de Dados
        idiomaCbx.addItem("Espanhol");
        idiomaCbx.addItem("Inglês");
        idiomaCbx.addItem("Italiano");
        idiomaCbx.addItem("Português");
        //
        getContentPane().add(idiomaCbx);

        professorCbx = new JComboBox();
        professorCbx.setBounds(110, 74, 130, 20);
        //Modificar com o Banco de Dados
        professorCbx.addItem("Fulano");
        professorCbx.addItem("Ciclano");
        professorCbx.addItem("Beltrano");
        professorCbx.addItem("Zicrano");
        //
        getContentPane().add(professorCbx);

        alunoCbx = new JComboBox();
        alunoCbx.setBounds(110, 119, 130, 20);
        //Modificar com o Banco de Dados
        alunoCbx.addItem("Tu");
        alunoCbx.addItem("Ele");
        alunoCbx.addItem("Vós");
        alunoCbx.addItem("Eles");
        //
        getContentPane().add(alunoCbx);

        periodoCbx = new JComboBox();
        periodoCbx.setBounds(110, 164, 130, 20);
        //Modificar com o Banco de Dados
        periodoCbx.addItem("Matutino");
        periodoCbx.addItem("Vespertino");
        periodoCbx.addItem("Noturno");
        //
        getContentPane().add(periodoCbx);

        btnCadastrar = new JButton("Cadastrar");
        btnCancelar = new JButton("Cancelar");

        btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCadastrar.setBounds(145, 210, 95, 23);
        getContentPane().add(btnCadastrar);

        btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCancelar.setBounds(30, 210, 95, 23);
        getContentPane().add(btnCancelar);

    }
}
