package com.topicos.telas.frames.principalFrame;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;

import com.topicos.aula.AulaInternalFrame;

import com.topicos.login.Login;
import com.topicos.logs.login.LogLogin;
import com.topicos.logs.logsys.LogDeAcoes;
import com.topicos.pessoa.listarTela.ListarAluno;
import com.topicos.pessoa.listarTela.ListarProfessor;
import com.topicos.pessoa.PessoaInternalFrame;

public class Principal extends JFrame {
    private JPanel contentPane;

    private JMenuBar menuBar = new JMenuBar();

    private JMenu ArquivoMenu = new JMenu("Arquivo");
    private JButton btnLogout;
    private JMenuItem SairArquivoItem = new JMenuItem("Sair");

    private JMenu AdminMenu = new JMenu("Admin");
    private JButton btnExit;

    private JMenuItem ListarAlunoItem = new JMenuItem("Listar Aluno");
    private JMenuItem ListarProfessorItem = new JMenuItem("Listar Professor");

    private JMenuItem RemoverUsuarioItem = new JMenuItem("Remover Usuario");

    private JMenu AjudaMenu = new JMenu("Ajuda");

    private PessoaInternalFrame pessoaInternalFrame = new PessoaInternalFrame();
    private ListarAluno listarAluno = new ListarAluno();
    private ListarProfessor listarProfessor = new ListarProfessor();

    private AulaInternalFrame aulaInternalFrame = new AulaInternalFrame();

//    private IdiomaInternalFrame idiomaInternalFrame = new IdiomaInternalFrame();


    private ActionListener handle;
    private JMenuItem SobreItem = new JMenuItem("Sobre");

    private JMenu userNameItem = new JMenu("Olá, " + LogLogin.lerUsuario());

    private JMenuItem LogoutItem = new JMenuItem("Logout");
    private JMenuItem EditarUserItem = new JMenuItem("Editar Usuário");
    private JMenuItem AcessarLog = new JMenuItem("Abrir histórico do usuário");

    /**
     * Create the frame.
     */
    public Principal() {

        setTitle("Topicos Especiais - I");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 811, 711);

        setJMenuBar(menuBar);

        menuBar.add(ArquivoMenu);

        ArquivoMenu.add(SairArquivoItem);

        menuBar.add(AdminMenu);

        AdminMenu.add(ListarAlunoItem);

        AdminMenu.add(ListarProfessorItem);

        AdminMenu.add(RemoverUsuarioItem);

        menuBar.add(AjudaMenu);

        AjudaMenu.add(SobreItem);

        menuBar.add(new javax.swing.JSeparator(SwingConstants.VERTICAL));

        menuBar.add(userNameItem);

        userNameItem.add(AcessarLog);


        userNameItem.add(EditarUserItem);

        userNameItem.add(LogoutItem);

        contentPane = new JPanel();
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelOpcoes = new JPanel();
        panelOpcoes.setBorder(new LineBorder(null));
        panelOpcoes.setBounds(0, 0, 1920, 53);
        contentPane.add(panelOpcoes);
        panelOpcoes.setLayout(null);

        handle = new ListennerPrincipalFrame(SobreItem, btnLogout, btnExit, this);
        //Botão de cadastro de idioma
        JButton btnCadastrarIdioma = new JButton("Cadastrar idioma");
        btnCadastrarIdioma.setBorder(new LineBorder(new Color(0,0,0)));
        btnCadastrarIdioma.setIcon(new ImageIcon((Principal.class.getResource("/com/topicos/icones/register.png"))));
        btnCadastrarIdioma.setBounds(555,6,131,45);
        panelOpcoes.add(btnCadastrarIdioma);

        //Botão de cadastro de pessoas
        JButton btnCadastrar = new JButton("Cadastrar pessoa");
        btnCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnCadastrar.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/icones/register.png")));
        btnCadastrar.setBounds(269, 6, 131, 45);
        panelOpcoes.add(btnCadastrar);

        JButton btnCadastrarTurma = new JButton("Cadastrar Turma");
        btnCadastrarTurma.setBorder(new LineBorder(new Color(0, 0, 0)));
        btnCadastrarTurma.setIcon(new ImageIcon(Principal.class.getResource("/com/topicos/icones/register.png")));
        btnCadastrarTurma.setBounds(412, 6, 131, 45);
        panelOpcoes.add(btnCadastrarTurma);

        SobreItem.addActionListener(handle);

        contentPane.add(pessoaInternalFrame);
        contentPane.add(aulaInternalFrame);
//        contentPane.add(idiomaInternalFrame);
        contentPane.add(listarAluno);
        contentPane.add(listarProfessor);

        userNameItem.setForeground(Color.white);
        userNameItem.setAlignmentX(Component.RIGHT_ALIGNMENT);

        setVisible(true);

        ListarAlunoItem.addActionListener(evt -> listarAluno.setVisible(true));
        ListarProfessorItem.addActionListener(evt -> listarProfessor.setVisible(true));

        AcessarLog.addActionListener(evt ->{LogDeAcoes.lerLog();});

        LogoutItem.addActionListener(evt -> {dispose(); new Login().setVisible(true);});


        userNameItem.addActionListener(evt -> new Login().setVisible(true));


        SairArquivoItem.addActionListener(e -> {
            dispose();
        });

        btnCadastrar.addActionListener(e -> {
            pessoaInternalFrame.setVisible(true);
        });

        btnCadastrarTurma.addActionListener(e -> {
            aulaInternalFrame.setVisible(true);
        });

//        btnCadastrarIdioma.addActionListener(e -> {
//            idiomaInternalFrame.setVisible(true);
//        });

//        btnSalvar.addActionListener(e ->{
//            System.out.println("Salvar Principal");
//        });

    }

    //public void ListarAluno(java.awt.event.ActionEvent evt){
        //listarAluno.setVisible(true);
    //}
}