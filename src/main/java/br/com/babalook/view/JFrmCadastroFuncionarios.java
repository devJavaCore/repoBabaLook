package br.com.babalook.view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import br.com.babalook.util.BotoesNavegacaoTab;
import br.com.babalook.util.CentralizaJFrame;
import br.com.babalook.util.TabDadosContrato;
import br.com.babalook.util.TabDadosFuncionario;
import br.com.babalook.util.TabDadosPessoais;
import br.com.babalook.util.TabEndereco;

public class JFrmCadastroFuncionarios extends JFrame {

	protected JPanel contentPane;

	BotoesNavegacaoTab botoesNavegacaoTab = new BotoesNavegacaoTab();
	TabDadosPessoais tabDadosPessoais = new TabDadosPessoais();
	TabEndereco tabEndereco = new TabEndereco();
	TabDadosContrato tabDadosContrato = new TabDadosContrato();
	TabDadosFuncionario tabDadosFuncionario = new TabDadosFuncionario();
	CentralizaJFrame centralizaJFrame = new CentralizaJFrame();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmCadastroFuncionarios frame = new JFrmCadastroFuncionarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrmCadastroFuncionarios() {

		setLocationRelativeTo(null);

		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("Cadastro de Funcionarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		centralizaJFrame.centralizarJframe(this);


		JPanel jpDadosPessoais = new JPanel();
		JPanel jpEndereco = new JPanel();
		JPanel jpDadosContrato = new JPanel();
		JPanel jpDadosFuncionario = new JPanel();
		JTabbedPane jtpTabs = new JTabbedPane();
		jtpTabs.setBounds(5, 5, 811, 294);

		tabDadosPessoais.dadosPessoais(jpDadosPessoais, jtpTabs);
		botoesNavegacaoTab.btnCancelaProximo(jpDadosPessoais, jtpTabs, this, 1);
		tabEndereco.endereco(jpEndereco, jtpTabs);
		botoesNavegacaoTab.btnAnteriorProximo(jpEndereco, jtpTabs, this, 2, 0);
		tabDadosContrato.dadosContrato(jpDadosPessoais, jpDadosContrato, jtpTabs);
		botoesNavegacaoTab.btnAnteriorProximo(jpDadosContrato, jtpTabs, this, 3, 1);
		tabDadosFuncionario.dadosFuncionario(jpDadosContrato, jpDadosFuncionario, jtpTabs);
		botoesNavegacaoTab.btnCancelaAnteriorConfirma(jpDadosFuncionario, jtpTabs, this, 2);

		getContentPane().add(jtpTabs);
	}
}
