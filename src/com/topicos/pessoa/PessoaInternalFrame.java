/*
Criado por Herick Maciel Maia
Data: 15/05/18
*/

package com.topicos.pessoa;

import com.topicos.comum.enums.Estados;
import com.topicos.pessoa.listener.PessoaInternalListener;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class PessoaInternalFrame extends JInternalFrame {
    private JTextField txtNome;
    private JTextField txtSobrenome;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblEmail2;
    private JTextField txtEmail2;
    private JLabel lblTelefone;
    private JFormattedTextField txtTelefone;
    private JLabel lblTelefone2;
    private JFormattedTextField txtTelefone2;
    private JLabel lblCidade;
    private JTextField txtCidade;
    private JLabel lblEstado;
    private JTextField txtCep;
    private JTextField txtRua;
    private JTextField txtNumero;
    private JLabel lblOcupacao;
    private JTextField txtCurso;
    private JLabel lblModulo;
    private JTextField txtModulo;
    private JLabel lblPis;
    private JTextField txtPis;
    private JLabel lblSalario;
    private JTextField txtSalario;

    private JCheckBox chckbxAluno;
    private JCheckBox chckbxProfessor;
    private JLabel lblCurso;
    private JLabel lblPagamento;
    private JCheckBox chckbxSim;
    private JCheckBox chckbxNao;

    private MaskFormatter maskFormatter;

    public PessoaInternalFrame() {
        setTitle("Cadastro de Pessoas");
        setBounds(100, 100, 557, 471);
        getContentPane().setLayout(null);
        setClosable(true);
        setResizable(true);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNome.setBounds(10, 11, 46, 14);
        getContentPane().add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(76, 10, 150, 20);
        getContentPane().add(txtNome);
        txtNome.setColumns(10);

        JLabel lblSobrenome = new JLabel("Sobrenome:");
        lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSobrenome.setBounds(236, 11, 76, 14);
        getContentPane().add(lblSobrenome);

        txtSobrenome = new JTextField();
        txtSobrenome.setBounds(378, 10, 150, 20);
        getContentPane().add(txtSobrenome);
        txtSobrenome.setColumns(10);

        lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail.setBounds(10, 60, 46, 14);
        getContentPane().add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(76, 59, 150, 20);
        getContentPane().add(txtEmail);
        txtEmail.setColumns(10);

        lblEmail2 = new JLabel("Email 2 (opcional):");
        lblEmail2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail2.setBounds(236, 60, 112, 14);
        getContentPane().add(lblEmail2);

        txtEmail2 = new JTextField();
        txtEmail2.setBounds(378, 59, 150, 20);
        getContentPane().add(txtEmail2);
        txtEmail2.setColumns(10);

        lblTelefone = new JLabel("Telefone:");
        lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTelefone.setBounds(10, 109, 56, 14);
        getContentPane().add(lblTelefone);

        try{
            maskFormatter = new MaskFormatter("####-####");
            maskFormatter.setPlaceholderCharacter('_');
        }catch(ParseException pex){}

        txtTelefone = new JFormattedTextField(maskFormatter);
        txtTelefone.setBounds(76, 108, 150, 20);
        getContentPane().add(txtTelefone);
        txtTelefone.setColumns(10);

        lblTelefone2 = new JLabel("Telefone 2 (opcional):");
        lblTelefone2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTelefone2.setBounds(236, 109, 132, 14);
        getContentPane().add(lblTelefone2);

        txtTelefone2 = new JFormattedTextField(maskFormatter);
        txtTelefone2.setBounds(378, 108, 150, 20);
        getContentPane().add(txtTelefone2);
        txtTelefone2.setColumns(10);

        lblCidade = new JLabel("Cidade:");
        lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCidade.setBounds(10, 158, 46, 14);
        getContentPane().add(lblCidade);

        txtCidade = new JTextField();
        txtCidade.setBounds(76, 157, 150, 20);
        getContentPane().add(txtCidade);
        txtCidade.setColumns(10);

        lblEstado = new JLabel("Estado:");
        lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEstado.setBounds(236, 160, 56, 14);
        getContentPane().add(lblEstado);

        JComboBox<Estados> cbxEstado = new JComboBox();
        //Modificar com o Banco de Dados
        cbxEstado.setModel(new DefaultComboBoxModel<>(Estados.values()));
        cbxEstado.setBounds(302, 157, 66, 20);
        getContentPane().add(cbxEstado);

        JLabel lblCep = new JLabel("CEP:");
        lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCep.setBounds(378, 160, 39, 14);
        getContentPane().add(lblCep);

        txtCep = new JTextField();
        txtCep.setBounds(427, 157, 101, 20);
        getContentPane().add(txtCep);
        txtCep.setColumns(10);

        JLabel lblRua = new JLabel("Rua:");
        lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblRua.setBounds(10, 207, 46, 14);
        getContentPane().add(lblRua);

        txtRua = new JTextField();
        txtRua.setBounds(76, 206, 292, 20);
        getContentPane().add(txtRua);
        txtRua.setColumns(10);

        JLabel lblNumero = new JLabel("N\u00BA:");
        lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNumero.setBounds(378, 209, 46, 14);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(427, 206, 101, 20);
        getContentPane().add(txtNumero);
        txtNumero.setColumns(10);

        lblOcupacao = new JLabel("Ocupa\u00E7\u00E3o:");
        lblOcupacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblOcupacao.setBounds(10, 256, 76, 14);
        getContentPane().add(lblOcupacao);

        chckbxAluno = new JCheckBox("Aluno");
        chckbxAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxAluno.setBounds(113, 252, 97, 23);
        getContentPane().add(chckbxAluno);

        chckbxProfessor = new JCheckBox("Professor");
        chckbxProfessor.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxProfessor.setBounds(215, 252, 97, 23);
        getContentPane().add(chckbxProfessor);

        lblCurso = new JLabel("Curso:");
        lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCurso.setBounds(10, 305, 46, 14);
        getContentPane().add(lblCurso);
        lblCurso.setEnabled(false);

        txtCurso = new JTextField();
        txtCurso.setBounds(76, 304, 150, 20);
        getContentPane().add(txtCurso);
        txtCurso.setColumns(10);
        txtCurso.setEnabled(false);

        lblPagamento = new JLabel("Pagamento em dia:");
        lblPagamento.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPagamento.setBounds(236, 305, 132, 14);
        getContentPane().add(lblPagamento);
        lblPagamento.setEnabled(false);

        chckbxSim = new JCheckBox("Sim");
        chckbxSim.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxSim.setBounds(378, 301, 66, 23);
        getContentPane().add(chckbxSim);
        chckbxSim.setEnabled(false);

        chckbxNao = new JCheckBox("N\u00E3o");
        chckbxNao.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxNao.setBounds(446, 301, 82, 23);
        getContentPane().add(chckbxNao);
        chckbxNao.setEnabled(false);

        lblModulo = new JLabel("M\u00F3dulo:");
        lblModulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblModulo.setBounds(10, 354, 56, 14);
        getContentPane().add(lblModulo);
        lblModulo.setEnabled(false);

        txtModulo = new JTextField();
        txtModulo.setBounds(76, 353, 150, 20);
        getContentPane().add(txtModulo);
        txtModulo.setColumns(10);
        txtModulo.setEnabled(false);

        lblPis = new JLabel("PIS:");
        lblPis.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPis.setBounds(236, 356, 46, 14);
        getContentPane().add(lblPis);
        lblPis.setEnabled(false);

        txtPis = new JTextField();
        txtPis.setBounds(276, 354, 92, 20);
        getContentPane().add(txtPis);
        txtPis.setColumns(10);
        txtPis.setEnabled(false);

        lblSalario = new JLabel("Sal\u00E1rio:");
        lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSalario.setBounds(378, 356, 46, 14);
        getContentPane().add(lblSalario);
        lblSalario.setEnabled(false);

        txtSalario = new JTextField();
        txtSalario.setBounds(436, 353, 92, 20);
        getContentPane().add(txtSalario);
        txtSalario.setColumns(10);
        txtSalario.setEnabled(false);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCancelar.setBounds(10, 403, 97, 23);
        getContentPane().add(btnCancelar);

        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnCadastrar.setBounds(129, 403, 97, 23);
        getContentPane().add(btnCadastrar);

        ActionListener handle = new PessoaInternalListener(btnCancelar,btnCadastrar);

        btnCancelar.addActionListener(handle);
        btnCadastrar.addActionListener(handle);

        chckbxAluno.addActionListener(this::checkBox);
        chckbxProfessor.addActionListener(this::checkBox);
    }
    public void checkBox(java.awt.event.ActionEvent evt){
        //manipulando JCheckBox de aluno e professor
        if(chckbxAluno.isSelected()){
            lblCurso.setEnabled(true);
            txtCurso.setEnabled(true);
            lblPagamento.setEnabled(true);
            chckbxSim.setEnabled(true);
            chckbxNao.setEnabled(true);
        } else{
            lblCurso.setEnabled(false);
            txtCurso.setEnabled(false);
            lblPagamento.setEnabled(false);
            chckbxSim.setEnabled(false);
            chckbxNao.setEnabled(false);
        }

        if(chckbxProfessor.isSelected()){
            lblModulo.setEnabled(true);
            txtModulo.setEnabled(true);
            lblPis.setEnabled(true);
            txtPis.setEnabled(true);
            lblSalario.setEnabled(true);
            txtSalario.setEnabled(true);
        } else{
            lblModulo.setEnabled(false);
            txtModulo.setEnabled(false);
            lblPis.setEnabled(false);
            txtPis.setEnabled(false);
            lblSalario.setEnabled(false);
            txtSalario.setEnabled(false);
        }
    }
}