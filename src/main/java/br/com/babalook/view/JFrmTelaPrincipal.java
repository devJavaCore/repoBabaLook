package br.com.babalook.view;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.babalook.util.CentralizaJFrame;
import br.com.babalook.util.JBtnImageIcon;
import br.com.babalook.util.RemoveSetaJCombobox;

public class JFrmTelaPrincipal extends JFrame {

	private JPanel contentPane;

	RemoveSetaJCombobox removeSetaJCombobox = new RemoveSetaJCombobox();
	CentralizaJFrame centralizaJFrame = new CentralizaJFrame();
	JBtnImageIcon jBtnImageIcon = new JBtnImageIcon();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	      
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrmTelaPrincipal frame = new JFrmTelaPrincipal();
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
	public JFrmTelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		contentPane.setLayout(gbl_contentPane);

		centralizaJFrame.centralizarJframe(this);

		JLabel lblLogin = new JLabel("Login");
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 36;
		gbc_lblLogin.gridy = 0;
		contentPane.add(lblLogin, gbc_lblLogin);

		JComboBox jCBFinancas = new JComboBox();
		jCBFinancas.setModel(new DefaultComboBoxModel(new String[] {"Finanças", "Controle de Caixa", "Contas Receber/Pagar"}));
		GridBagConstraints gbc_jCBFinancas = new GridBagConstraints();
		gbc_jCBFinancas.insets = new Insets(0, 0, 5, 5);
		gbc_jCBFinancas.fill = GridBagConstraints.HORIZONTAL;
		gbc_jCBFinancas.gridx = 36;
		gbc_jCBFinancas.gridy = 2;
		
		jCBFinancas.setSelectedItem(-1);    

		
		
	        
		contentPane.add(jCBFinancas, gbc_jCBFinancas);
		removeSetaJCombobox.removeArrow(jCBFinancas);

		JButton jBtnCadastroProduto = new JButton(" ");
		GridBagConstraints gbc_jBtnCadastroProduto = new GridBagConstraints();
		gbc_jBtnCadastroProduto.insets = new Insets(0, 0, 5, 5);
		gbc_jBtnCadastroProduto.gridx = 20;
		gbc_jBtnCadastroProduto.gridy = 4;
		contentPane.add(jBtnCadastroProduto, gbc_jBtnCadastroProduto);

		jBtnImageIcon.imageButton(jBtnCadastroProduto, "Image/cadastroProduto.png");

		JButton jbtncadastrocliente = new JButton(" ");
		GridBagConstraints gbc_jbtncadastrocliente = new GridBagConstraints();
		gbc_jbtncadastrocliente.insets = new Insets(0, 0, 5, 5);
		gbc_jbtncadastrocliente.gridx = 21;
		gbc_jbtncadastrocliente.gridy = 4;
		contentPane.add(jbtncadastrocliente, gbc_jbtncadastrocliente);

		jBtnImageIcon.imageButton(jbtncadastrocliente, "Image/cadastroCliente.png");

		JButton btnJbtncadastrofornecedor = new JButton(" ");
		GridBagConstraints gbc_btnJbtncadastrofornecedor = new GridBagConstraints();
		gbc_btnJbtncadastrofornecedor.insets = new Insets(0, 0, 5, 5);
		gbc_btnJbtncadastrofornecedor.gridx = 22;
		gbc_btnJbtncadastrofornecedor.gridy = 4;
		contentPane.add(btnJbtncadastrofornecedor, gbc_btnJbtncadastrofornecedor);

		jBtnImageIcon.imageButton(btnJbtncadastrofornecedor, "Image/cadastroFornecedor.png");

		JButton jBtnAterarProduto = new JButton(" ");
		GridBagConstraints gbc_jBtnAterarProduto = new GridBagConstraints();
		gbc_jBtnAterarProduto.insets = new Insets(0, 0, 5, 5);
		gbc_jBtnAterarProduto.gridx = 23;
		gbc_jBtnAterarProduto.gridy = 4;
		contentPane.add(jBtnAterarProduto, gbc_jBtnAterarProduto);

		jBtnImageIcon.imageButton(jBtnAterarProduto, "Image/alterarProduto.png");

		JButton jBtnAlterarCliente = new JButton(" ");
		GridBagConstraints gbc_jBtnAlterarCliente = new GridBagConstraints();
		gbc_jBtnAlterarCliente.insets = new Insets(0, 0, 5, 5);
		gbc_jBtnAlterarCliente.gridx = 24;
		gbc_jBtnAlterarCliente.gridy = 4;
		contentPane.add(jBtnAlterarCliente, gbc_jBtnAlterarCliente);

		jBtnImageIcon.imageButton(jBtnAlterarCliente, "Image/alterarCliente.png");

		JButton jBtnAlugado = new JButton(" ");
		GridBagConstraints gbc_jBtnAlugado = new GridBagConstraints();
		gbc_jBtnAlugado.insets = new Insets(0, 0, 5, 5);
		gbc_jBtnAlugado.gridx = 25;
		gbc_jBtnAlugado.gridy = 4;
		contentPane.add(jBtnAlugado, gbc_jBtnAlugado);

		jBtnImageIcon.imageButton(jBtnAlugado, "Image/alugado.png");

		JButton jBtnAluguelatrasado = new JButton(" ");
		GridBagConstraints gbc_jBtnAluguelatrasado = new GridBagConstraints();
		gbc_jBtnAluguelatrasado.insets = new Insets(0, 0, 5, 5);
		gbc_jBtnAluguelatrasado.gridx = 26;
		gbc_jBtnAluguelatrasado.gridy = 4;
		contentPane.add(jBtnAluguelatrasado, gbc_jBtnAluguelatrasado);

		jBtnImageIcon.imageButton(jBtnAluguelatrasado, "Image/aluguelAtrasado.png");

		JLabel jLblCliente = new JLabel("Cliente");
		GridBagConstraints gbc_jLblCliente = new GridBagConstraints();
		gbc_jLblCliente.insets = new Insets(0, 0, 1, 5);
		gbc_jLblCliente.gridx = 21;
		gbc_jLblCliente.gridy = 5;
		contentPane.add(jLblCliente, gbc_jLblCliente);

		JLabel jlblfornecedor = new JLabel("Fornecedor");
		GridBagConstraints gbc_jlblfornecedor = new GridBagConstraints();
		gbc_jlblfornecedor.insets = new Insets(0, 0, 1, 5);
		gbc_jlblfornecedor.gridx = 22;
		gbc_jlblfornecedor.gridy = 5;
		contentPane.add(jlblfornecedor, gbc_jlblfornecedor);

		JLabel jLblAlteraProduto = new JLabel("Produto");
		GridBagConstraints gbc_jLblAlteraProduto = new GridBagConstraints();
		gbc_jLblAlteraProduto.insets = new Insets(0, 0, 1, 5);
		gbc_jLblAlteraProduto.gridx = 23;
		gbc_jLblAlteraProduto.gridy = 5;
		contentPane.add(jLblAlteraProduto, gbc_jLblAlteraProduto);

		JLabel jLblAlterarCliente = new JLabel("Cliente");
		GridBagConstraints gbc_jLblAlterarCliente = new GridBagConstraints();
		gbc_jLblAlterarCliente.insets = new Insets(0, 0, 1, 5);
		gbc_jLblAlterarCliente.gridx = 24;
		gbc_jLblAlterarCliente.gridy = 5;
		contentPane.add(jLblAlterarCliente, gbc_jLblAlterarCliente);

		JLabel jLblAlugado = new JLabel("Alugado");
		GridBagConstraints gbc_jLblAlugado = new GridBagConstraints();
		gbc_jLblAlugado.insets = new Insets(0, 0, 1, 5);
		gbc_jLblAlugado.gridx = 25;
		gbc_jLblAlugado.gridy = 5;
		contentPane.add(jLblAlugado, gbc_jLblAlugado);

		JLabel jLblAtrasado = new JLabel("Atrasado");
		GridBagConstraints gbc_jLblAtrasado = new GridBagConstraints();
		gbc_jLblAtrasado.insets = new Insets(0, 0, 1, 5);
		gbc_jLblAtrasado.gridx = 26;
		gbc_jLblAtrasado.gridy = 5;
		contentPane.add(jLblAtrasado, gbc_jLblAtrasado);

	}
}
