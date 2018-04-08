/*
Criado por Gabriel Gageiro;
Data:02/04/18
*/


package com.topicos.telas.internalFrame;

import java.awt.*;

import javax.swing.*;

public class PessoasInternalFrame extends JInternalFrame {
    private JTextField cidadeTextField;
    private JTextField cepTextField;
    private JTextField nomeTextField;
    private JTextField sobrenomeTextField;
    private JTextField emailTextField;
    private JTextField email2TextField;
    private JTextField telefoneTextField;
    private JTextField telefone2TextField;
    private JTextField ruaTextField;
    private JTextField numeroTextField;

    public PessoasInternalFrame() {
        setClosable(true);
        setTitle("Cadastro de Pessoas");
        setBounds(100, 100, 755, 501);
        getContentPane().setLayout(null);

        JLabel nomeLabel = new JLabel("Nome :");
        nomeLabel.setBounds(35, 27, 70, 15);
        getContentPane().add(nomeLabel);

        JLabel sobrenomeLabel = new JLabel("Sobrenome :");
        sobrenomeLabel.setBounds(324, 27, 90, 15);
        getContentPane().add(sobrenomeLabel);

        JLabel ruaLabel = new JLabel("Rua: ");
        ruaLabel.setBounds(35, 163, 70, 15);
        getContentPane().add(ruaLabel);

        JLabel cepLabel = new JLabel("CEP: ");
        cepLabel.setBounds(452, 222, 70, 15);
        getContentPane().add(cepLabel);

        JLabel cidadeLabel = new JLabel("Cidade: ");
        cidadeLabel.setBounds(35, 222, 70, 15);
        getContentPane().add(cidadeLabel);

        JComboBox UFcomboBox = new JComboBox();
        UFcomboBox.setBounds(359, 217, 32, 24);
        getContentPane().add(UFcomboBox);

        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(35, 75, 70, 15);
        getContentPane().add(emailLabel);

        JLabel telefoneLabel = new JLabel("Telefone: ");
        telefoneLabel.setBounds(35, 117, 78, 15);
        getContentPane().add(telefoneLabel);

        JLabel telefone2Label = new JLabel("Telefone 2 (opcional):");
        telefone2Label.setBounds(321, 117, 163, 15);
        getContentPane().add(telefone2Label);

        JLabel ocupacaoLabel = new JLabel("Ocupação: ");
        ocupacaoLabel.setBounds(35, 284, 98, 15);
        getContentPane().add(ocupacaoLabel);

        JCheckBox alunoChckbx = new JCheckBox("Aluno");
        alunoChckbx.setBounds(195, 280, 129, 23);
        getContentPane().add(alunoChckbx);

        JCheckBox ProfessorChckbx = new JCheckBox("Professor");
        ProfessorChckbx.setBounds(332, 280, 129, 23);
        getContentPane().add(ProfessorChckbx);

        cidadeTextField = new JTextField();
        cidadeTextField.setBounds(100, 220, 199, 19);
        getContentPane().add(cidadeTextField);
        cidadeTextField.setColumns(10);

        cepTextField = new JTextField();
        cepTextField.setBounds(503, 220, 156, 19);
        getContentPane().add(cepTextField);
        cepTextField.setColumns(10);

        nomeTextField = new JTextField();
        nomeTextField.setBounds(100, 25, 199, 19);
        getContentPane().add(nomeTextField);
        nomeTextField.setColumns(10);

        sobrenomeTextField = new JTextField();
        sobrenomeTextField.setBounds(429, 25, 230, 19);
        getContentPane().add(sobrenomeTextField);
        sobrenomeTextField.setColumns(10);

        JLabel email2Label = new JLabel("Email 2 (opcional): ");
        email2Label.setBounds(321, 75, 140, 15);
        getContentPane().add(email2Label);

        emailTextField = new JTextField();
        emailTextField.setBounds(100, 73, 199, 19);
        getContentPane().add(emailTextField);
        emailTextField.setColumns(10);

        email2TextField = new JTextField();
        email2TextField.setBounds(462, 73, 197, 19);
        getContentPane().add(email2TextField);
        email2TextField.setColumns(10);

        telefoneTextField = new JTextField();
        telefoneTextField.setBounds(110, 115, 186, 19);
        getContentPane().add(telefoneTextField);
        telefoneTextField.setColumns(10);

        telefone2TextField = new JTextField();
        telefone2TextField.setBounds(488, 115, 171, 19);
        getContentPane().add(telefone2TextField);
        telefone2TextField.setColumns(10);

        ruaTextField = new JTextField();
        ruaTextField.setBounds(97, 161, 408, 19);
        getContentPane().add(ruaTextField);
        ruaTextField.setColumns(10);

        JLabel numeroLabel = new JLabel("Numero: ");
        numeroLabel.setBounds(524, 163, 70, 15);
        getContentPane().add(numeroLabel);

        numeroTextField = new JTextField();
        numeroTextField.setBounds(597, 161, 62, 19);
        getContentPane().add(numeroTextField);
        numeroTextField.setColumns(10);
    }
}