package br.com.babalook.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

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

public class JFrmCadastroCliente extends JFrame {

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
					JFrmCadastroCliente frame = new JFrmCadastroCliente();
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
	public JFrmCadastroCliente() {

		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		centralizaJFrame.centralizarJframe(this);

		JPanel jpDadosPessoais = new JPanel();
		JPanel jpEndereco = new JPanel();
		JTabbedPane jtpTabs = new JTabbedPane();
		jtpTabs.setBounds(5, 5, 811, 294);

		tabDadosPessoais.dadosPessoais(jpDadosPessoais, jtpTabs);
		botoesNavegacaoTab.btnCancelaProximo(jpDadosPessoais, jtpTabs, this, 1);
		tabEndereco.endereco(jpEndereco, jtpTabs);
		botoesNavegacaoTab.btnCancelaAnteriorConfirma(jpEndereco, jtpTabs, this, 0);

		getContentPane().add(jtpTabs);
	}

}
