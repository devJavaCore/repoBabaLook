package br.com.babalook.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import br.com.babalook.util.CentralizaJFrame;
import br.com.babalook.util.JBtnImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;

 
public class JFrmMain extends JFrame {

	private JPanel contentPane;
	
	CentralizaJFrame centralizaJFrame = new CentralizaJFrame();
	JBtnImageIcon jBtnImageIcon = new JBtnImageIcon();
	private JTextField txtSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
										
					
					JFrmMain frame = new JFrmMain();
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
	public JFrmMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("Baba Look");
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		centralizaJFrame.centralizarJframe(this);
		
		JButton jBtnSair = new JButton("Sair");
		jBtnSair.setBounds(1100, 84, 117, 25);
		jBtnSair.setForeground(Color.WHITE);
		jBtnSair.setOpaque(false);
		jBtnSair.setContentAreaFilled(false);
		jBtnSair.setBorderPainted(false);
		contentPane.add(jBtnSair);
		
		
		
		
		JPanel jPanelInformacoesPanel = new JPanel();
		jPanelInformacoesPanel.setBounds(150, 200, 870, 410);
		contentPane.add(jPanelInformacoesPanel);
		jPanelInformacoesPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 540, 390);
		jPanelInformacoesPanel.add(panel);
		panel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.LIGHT_GRAY));
		panel.setLayout(null);
		
		JPanel jPanelBtn1 = new JPanel();
		jPanelBtn1.setBounds(10, 10, 250, 375);
		panel.add(jPanelBtn1);
		GridBagLayout gbl_jPanelBtn1 = new GridBagLayout();
		gbl_jPanelBtn1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_jPanelBtn1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_jPanelBtn1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_jPanelBtn1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		jPanelBtn1.setLayout(gbl_jPanelBtn1);
		
		
		
		
		
		
		
		
		
		
		
		JButton jBtnNovaVendaServico = new JButton("     Nova Venda/Serviço");
		jBtnNovaVendaServico.setHorizontalAlignment(SwingConstants.LEFT);
		jBtnNovaVendaServico.setBackground(Color.WHITE);
		jBtnNovaVendaServico.setOpaque(true);
		jBtnNovaVendaServico.setForeground(Color.DARK_GRAY);
		
		jBtnNovaVendaServico.setBorder(UIManager.getBorder("Button.border"));
		jBtnNovaVendaServico.setPreferredSize(new Dimension(250, 70));
		jBtnNovaVendaServico.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_jBtnNovaVendaServico = new GridBagConstraints();
		gbc_jBtnNovaVendaServico.insets = new Insets(0, 0, 5, 0);
		gbc_jBtnNovaVendaServico.gridx = 2;
		gbc_jBtnNovaVendaServico.gridy = 2;
		jPanelBtn1.add(jBtnNovaVendaServico, gbc_jBtnNovaVendaServico);
		jBtnImageIcon.imageButton(jBtnNovaVendaServico, "Image/novaVenda.jpeg");
		jBtnNovaVendaServico.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		JButton jBtnNovoAluguel = new JButton("     Novo Aluguel");
		jBtnNovoAluguel.setHorizontalAlignment(SwingConstants.LEFT);
		jBtnNovoAluguel.setBackground(Color.WHITE);
		jBtnNovoAluguel.setOpaque(true);
		jBtnNovoAluguel.setForeground(Color.DARK_GRAY);
		jBtnNovoAluguel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBtnNovoAluguel.setBorder(UIManager.getBorder("Button.border"));
		jBtnNovoAluguel.setPreferredSize(new Dimension(250, 70));
		jBtnNovoAluguel.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_jBtnNovoAluguel = new GridBagConstraints();
		gbc_jBtnNovoAluguel.insets = new Insets(0, 0, 5, 0);
		gbc_jBtnNovoAluguel.gridx = 2;
		gbc_jBtnNovoAluguel.gridy = 3;
		jPanelBtn1.add(jBtnNovoAluguel, gbc_jBtnNovoAluguel);
		jBtnImageIcon.imageButton(jBtnNovoAluguel, "Image/handshake.jpeg");
		jBtnNovoAluguel.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		JButton jBtnDevolver = new JButton("     Devolver Alugado");
		jBtnDevolver.setHorizontalAlignment(SwingConstants.LEFT);
		jBtnDevolver.setBackground(Color.WHITE);
		jBtnDevolver.setOpaque(true);
		jBtnDevolver.setForeground(Color.DARK_GRAY);
		jBtnDevolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBtnDevolver.setBorder(UIManager.getBorder("Button.border"));
		jBtnDevolver.setPreferredSize(new Dimension(250, 70));
		jBtnDevolver.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_jBtnDevolver = new GridBagConstraints();
		gbc_jBtnDevolver.insets = new Insets(0, 0, 5, 0);
		gbc_jBtnDevolver.gridx = 2;
		gbc_jBtnDevolver.gridy = 4;
		jPanelBtn1.add(jBtnDevolver, gbc_jBtnDevolver);
		jBtnImageIcon.imageButton(jBtnDevolver, "Image/devolver.png");
		jBtnDevolver.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		JButton jBtnCancelar = new JButton("     Cancelar");
		jBtnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
		jBtnCancelar.setBackground(Color.WHITE);
		jBtnCancelar.setOpaque(true);
		jBtnCancelar.setForeground(Color.DARK_GRAY);
		jBtnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBtnCancelar.setBorder(UIManager.getBorder("Button.border"));
		jBtnCancelar.setPreferredSize(new Dimension(250, 70));
		jBtnCancelar.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_jBtnCancelar = new GridBagConstraints();
		gbc_jBtnCancelar.insets = new Insets(0, 0, 5, 0);
		gbc_jBtnCancelar.gridx = 2;
		gbc_jBtnCancelar.gridy = 5;
		jPanelBtn1.add(jBtnCancelar, gbc_jBtnCancelar);
		jBtnImageIcon.imageButton(jBtnCancelar, "Image/cancelar.jpeg");
		jBtnCancelar.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		JButton jBtnComprovante = new JButton("     Emitir Comprovante");
		jBtnComprovante.setHorizontalAlignment(SwingConstants.LEFT);
		jBtnComprovante.setBackground(Color.WHITE);
		jBtnComprovante.setOpaque(true);
		jBtnComprovante.setForeground(Color.DARK_GRAY);
		jBtnComprovante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBtnComprovante.setBorder(UIManager.getBorder("Button.border"));
		jBtnComprovante.setPreferredSize(new Dimension(250, 70));
		jBtnComprovante.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_jBtnComprovante = new GridBagConstraints();
		gbc_jBtnComprovante.insets = new Insets(0, 0, 5, 0);
		gbc_jBtnComprovante.gridx = 2;
		gbc_jBtnComprovante.gridy = 6;
		jPanelBtn1.add(jBtnComprovante, gbc_jBtnComprovante);
		jBtnImageIcon.imageButton(jBtnComprovante, "Image/comprovante.jpeg");
		jBtnComprovante.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		JPanel jPanelBtn2 = new JPanel();
		jPanelBtn2.setBounds(280, 10, 250, 375);
		panel.add(jPanelBtn2);
		GridBagLayout gbl_jPanelBtn2 = new GridBagLayout();
		gbl_jPanelBtn2.columnWidths = new int[]{0, 0};
		gbl_jPanelBtn2.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_jPanelBtn2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_jPanelBtn2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		jPanelBtn2.setLayout(gbl_jPanelBtn2);
		
		JButton jBtnConsultaProduto = new JButton("     Consulta Produto");
		jBtnConsultaProduto.setHorizontalAlignment(SwingConstants.LEFT);
		jBtnConsultaProduto.setBackground(Color.WHITE);
		jBtnConsultaProduto.setOpaque(true);
		jBtnConsultaProduto.setForeground(Color.DARK_GRAY);
		jBtnConsultaProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBtnConsultaProduto.setBorder(UIManager.getBorder("Button.border"));
		jBtnConsultaProduto.setPreferredSize(new Dimension(250, 70));
		jBtnConsultaProduto.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_jBtnConsultaProduto = new GridBagConstraints();
		gbc_jBtnConsultaProduto.insets = new Insets(0, 0, 5, 0);
		gbc_jBtnConsultaProduto.gridx = 0;
		gbc_jBtnConsultaProduto.gridy = 0;
		jPanelBtn2.add(jBtnConsultaProduto, gbc_jBtnConsultaProduto);
		jBtnImageIcon.imageButton(jBtnConsultaProduto, "Image/consultaProduto.png");
		jBtnConsultaProduto.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		
		JButton jBtnConsultaVendaServico = new JButton("     Consulta Venda/Serviço");
		jBtnConsultaVendaServico.setHorizontalAlignment(SwingConstants.LEFT);
		jBtnConsultaVendaServico.setBackground(Color.WHITE);
		jBtnConsultaVendaServico.setOpaque(true);
		jBtnConsultaVendaServico.setForeground(Color.DARK_GRAY);
		jBtnConsultaVendaServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBtnConsultaVendaServico.setBorder(UIManager.getBorder("Button.border"));
		jBtnConsultaVendaServico.setPreferredSize(new Dimension(250, 70));
		jBtnConsultaVendaServico.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_jBtnConsultaVendaServico = new GridBagConstraints();
		gbc_jBtnConsultaVendaServico.insets = new Insets(0, 0, 5, 0);
		gbc_jBtnConsultaVendaServico.gridx = 0;
		gbc_jBtnConsultaVendaServico.gridy = 1;
		jPanelBtn2.add(jBtnConsultaVendaServico, gbc_jBtnConsultaVendaServico);
		jBtnImageIcon.imageButton(jBtnConsultaVendaServico, "Image/consultaVendas.jpeg");
		jBtnConsultaVendaServico.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		JButton jBtnConsultaCliente = new JButton("     Consulta Cliente");
		jBtnConsultaCliente.setHorizontalAlignment(SwingConstants.LEFT);
		jBtnConsultaCliente.setBackground(Color.WHITE);
		jBtnConsultaCliente.setOpaque(true);
		jBtnConsultaCliente.setForeground(Color.DARK_GRAY);
		jBtnConsultaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBtnConsultaCliente.setBorder(UIManager.getBorder("Button.border"));
		jBtnConsultaCliente.setPreferredSize(new Dimension(250, 70));
		jBtnConsultaCliente.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_jBtnConsultaCliente = new GridBagConstraints();
		gbc_jBtnConsultaCliente.insets = new Insets(0, 0, 5, 0);
		gbc_jBtnConsultaCliente.gridx = 0;
		gbc_jBtnConsultaCliente.gridy = 2;
		jPanelBtn2.add(jBtnConsultaCliente, gbc_jBtnConsultaCliente);
		jBtnImageIcon.imageButton(jBtnConsultaCliente, "Image/consultaCliente.png");
		jBtnConsultaCliente.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		JButton btnConsultaEntregas = new JButton("     Consulta Entregas");
		btnConsultaEntregas.setHorizontalAlignment(SwingConstants.LEFT);
		btnConsultaEntregas.setBackground(Color.WHITE);
		btnConsultaEntregas.setOpaque(true);
		btnConsultaEntregas.setForeground(Color.DARK_GRAY);
		btnConsultaEntregas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConsultaEntregas.setBorder(UIManager.getBorder("Button.border"));
		btnConsultaEntregas.setPreferredSize(new Dimension(250, 70));
		btnConsultaEntregas.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_btnConsultaEntregas = new GridBagConstraints();
		gbc_btnConsultaEntregas.insets = new Insets(0, 0, 5, 0);
		gbc_btnConsultaEntregas.gridx = 0;
		gbc_btnConsultaEntregas.gridy = 3;
		jPanelBtn2.add(btnConsultaEntregas, gbc_btnConsultaEntregas);
		jBtnImageIcon.imageButton(btnConsultaEntregas, "Image/consultaEntregas.png");
		btnConsultaEntregas.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		JButton jBtnRelatorioDeVendas = new JButton("     Relatório de Vendas");
		jBtnRelatorioDeVendas.setHorizontalAlignment(SwingConstants.LEFT);
		jBtnRelatorioDeVendas.setBackground(Color.WHITE);
		jBtnRelatorioDeVendas.setOpaque(true);
		jBtnRelatorioDeVendas.setForeground(Color.DARK_GRAY);
		jBtnRelatorioDeVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jBtnRelatorioDeVendas.setBorder(UIManager.getBorder("Button.border"));
		jBtnRelatorioDeVendas.setPreferredSize(new Dimension(250, 70));
		jBtnRelatorioDeVendas.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_jBtnRelatorioDeVendas = new GridBagConstraints();
		gbc_jBtnRelatorioDeVendas.insets = new Insets(0, 0, 5, 0);
		gbc_jBtnRelatorioDeVendas.gridx = 0;
		gbc_jBtnRelatorioDeVendas.gridy = 4;
		jPanelBtn2.add(jBtnRelatorioDeVendas, gbc_jBtnRelatorioDeVendas);
		jBtnImageIcon.imageButton(jBtnRelatorioDeVendas, "Image/relatorioVendas.jpeg");
		jBtnRelatorioDeVendas.setBorder(BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.gray, 1), 
		        BorderFactory.createEmptyBorder(5, 5, 10, 10)));
		
		JPanel jPanelInformacoes = new JPanel();
		jPanelInformacoes.setBounds(560, 10, 300, 390);
		jPanelInformacoesPanel.add(jPanelInformacoes);
		jPanelInformacoes.setBorder(BorderFactory.createMatteBorder(5, 5, 1, 1, Color.gray));
		jPanelInformacoes.setLayout(null);
		
		JLabel jLblAlertas = new JLabel("Alertas");
		jLblAlertas.setBounds(120, 26, 65, 19);
		jLblAlertas.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		jPanelInformacoes.add(jLblAlertas);
		
		JLabel jLblAtrasados = new JLabel("Atrasados:");
		jLblAtrasados.setBounds(35, 71, 78, 15);
		jPanelInformacoes.add(jLblAtrasados);
		
		JLabel jLblAlugados = new JLabel("Alugados:");
		jLblAlugados.setBounds(35, 91, 71, 15);
		jPanelInformacoes.add(jLblAlugados);
		
		JLabel jLblAEntregar = new JLabel("A Entregar:");
		jLblAEntregar.setBounds(35, 111, 80, 15);
		jPanelInformacoes.add(jLblAEntregar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JPanel JpanelCadastro = new JPanel();
		JpanelCadastro.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Cadastro", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 51, 51)));
		JpanelCadastro.setBounds(0, 5, 310, 104);
		contentPane.add(JpanelCadastro);
		JpanelCadastro.setLayout(null);
		
		JLabel jLblCadastroPrduto = new JLabel("Produto");
		jLblCadastroPrduto.setForeground(Color.WHITE);
		jLblCadastroPrduto.setBounds(22, 115, 70, 15);
		contentPane.add(jLblCadastroPrduto);
		
		JLabel jLblCadastroCliente = new JLabel("Cliente");
		jLblCadastroCliente.setForeground(Color.WHITE);
		jLblCadastroCliente.setBounds(130, 115, 70, 15);
		contentPane.add(jLblCadastroCliente);
		
		JLabel jLblCadastroFornecedor = new JLabel("Fornecedor");
		jLblCadastroFornecedor.setForeground(Color.WHITE);
		jLblCadastroFornecedor.setBounds(220, 115, 85, 15);
		contentPane.add(jLblCadastroFornecedor);
		
		JButton jBtnImgCadastroProduto = new JButton(" ");
		jBtnImgCadastroProduto.setBounds(5, 17, 100, 82);
		JpanelCadastro.add(jBtnImgCadastroProduto);
		jBtnImgCadastroProduto.setContentAreaFilled(false);
		jBtnImageIcon.imageButton(jBtnImgCadastroProduto, "Image/cadastroProduto.png");
		
		JButton jBtnCadastroCliente = new JButton("");
		jBtnCadastroCliente.setBounds(105, 17, 100, 82);
		JpanelCadastro.add(jBtnCadastroCliente);
		jBtnCadastroCliente.setContentAreaFilled(false);
		jBtnImageIcon.imageButton(jBtnCadastroCliente, "Image/cadastroCliente.png");
		
		
		JButton jBtnCadastroFornecedor = new JButton("");
		jBtnCadastroFornecedor.setBounds(205, 17, 100, 82);
		JpanelCadastro.add(jBtnCadastroFornecedor);
		jBtnCadastroFornecedor.setContentAreaFilled(false);
		jBtnImageIcon.imageButton(jBtnCadastroFornecedor, "Image/cadastroFornecedor.png");
		
		JLabel jLblAlteracaoPrduto = new JLabel("Produto");
		jLblAlteracaoPrduto.setForeground(Color.WHITE);
		jLblAlteracaoPrduto.setBounds(330, 115, 70, 15);
		contentPane.add(jLblAlteracaoPrduto);
		
		
		JLabel jLblAlteracaoCliente = new JLabel("Cliente");
		jLblAlteracaoCliente.setForeground(Color.WHITE);
		jLblAlteracaoCliente.setBounds(440, 115, 70, 15);
		contentPane.add(jLblAlteracaoCliente);
		
		JPanel jPanelAlteracao = new JPanel();
		jPanelAlteracao.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Altera\u00E7\u00E3o", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 51, 51)));
		jPanelAlteracao.setBounds(310, 5, 210, 104);
		contentPane.add(jPanelAlteracao);
		jPanelAlteracao.setLayout(null);
		
		
		JButton jBtnAlterarProduto = new JButton("");
		jBtnAlterarProduto.setBounds(5, 17, 100, 82);
		jPanelAlteracao.add(jBtnAlterarProduto);
		jBtnAlterarProduto.setContentAreaFilled(false);
		jBtnImageIcon.imageButton(jBtnAlterarProduto, "Image/alterarProduto.png");
		
		JButton jBtnAlterarCliente = new JButton("");
		jBtnAlterarCliente.setBounds(105, 17, 100, 82);
		jPanelAlteracao.add(jBtnAlterarCliente);
		jBtnAlterarCliente.setContentAreaFilled(false);
		jBtnImageIcon.imageButton(jBtnAlterarCliente, "Image/alterarCliente.png");
		
		JPanel jPanelAlguel = new JPanel();
		jPanelAlguel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3), "Aluguel", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(51, 51, 51)));
		jPanelAlguel.setBounds(520, 5, 210, 104);
		contentPane.add(jPanelAlguel);
		jPanelAlguel.setLayout(null);
		
		JButton jBtnAlugado = new JButton("");
		jBtnAlugado.setBounds(5, 17, 100, 82);
		jPanelAlguel.add(jBtnAlugado);
		jBtnAlugado.setContentAreaFilled(false);
		jBtnImageIcon.imageButton(jBtnAlugado, "Image/alugado.png");

		JButton jBtnAluguelAtrasado = new JButton("");
		jBtnAluguelAtrasado.setBounds(105, 17, 100, 82);
		jPanelAlguel.add(jBtnAluguelAtrasado);
		jBtnAluguelAtrasado.setContentAreaFilled(false);
		jBtnImageIcon.imageButton(jBtnAluguelAtrasado, "Image/aluguelAtrasado.png");
		
		
		JLabel jLblAluguelAlugados = new JLabel("Alugados");
		jLblAluguelAlugados.setForeground(Color.WHITE);
		jLblAluguelAlugados.setBounds(540, 115, 70, 15);
		contentPane.add(jLblAluguelAlugados);
		
		JLabel jLblAluguelAtrasados = new JLabel("Atrasados");
		jLblAluguelAtrasados.setForeground(Color.WHITE);
		jLblAluguelAtrasados.setBounds(640, 115, 80, 15);
		contentPane.add(jLblAluguelAtrasados);
		
		
		JLabel jLblImage = new JLabel("New label");
		//jLblImage.setIcon(new ImageIcon("/home/userone/Documents/Jacques/Programas/Sarah/icon/babalook.jpg"));
		jLblImage.setIcon(new ImageIcon(getClass().getResource("/Image/babalook.jpg")));
		jLblImage.setBounds(0, -59, 1220, 712);
		contentPane.add(jLblImage);
		

		
		
		
		   
		JMenu menuVenda, submenu;
		   JMenuItem novaVenda, cancelar, emitirComprovante;  
	          JMenuBar mb=new JMenuBar();  
	          menuVenda=new JMenu("Venda");  
	          //submenu=new JMenu("Sub Menu");  
	          novaVenda=new JMenuItem("Nova Venda/Serviço");  
	          cancelar=new JMenuItem("Cancelar");  
	          emitirComprovante=new JMenuItem("EmitirComprovante");  
	          menuVenda.add(novaVenda); menuVenda.add(cancelar); menuVenda.add(emitirComprovante);  
	          //submenu.add(i4); submenu.add(i5);  
	          //menuVenda.add(submenu);  
	           
	       JMenu menuAluguel;
	       JMenuItem novoAluguel, devolver, cancelarAluguel, emitirComprovanteAluguel; 
	       menuAluguel = new JMenu("Aluguel");
	       novoAluguel = new JMenuItem("Novo Aluguel");
	       devolver = new JMenuItem("Devolver");
	       cancelarAluguel = new JMenuItem("Cancelar");
	       emitirComprovanteAluguel = new JMenuItem("Emitir Comprovante");
	       menuAluguel.add(novoAluguel);menuAluguel.add(devolver);menuAluguel.add(cancelarAluguel);menuAluguel.add(emitirComprovanteAluguel);
	       
	          
	          
	          JMenu menuCadastro;
	          JMenuItem produto, funcionario, cliente, fornecedor, conta, serviço, tamanho, categoria, tipo, cor;
	          menuCadastro = new JMenu("Cadastro");
	          produto = new JMenuItem("Produto");
	          funcionario = new JMenuItem("Funcionario");
	          cliente = new JMenuItem("Cliente");
	          fornecedor = new JMenuItem("Fornecedor");
	          conta = new JMenuItem("Conta");
	          serviço = new JMenuItem("Serviço");
	          tamanho = new JMenuItem("Tamanho");
	          categoria = new JMenuItem("Categoria");
	          tipo = new JMenuItem("Tipo");
	          cor = new JMenuItem("Cor");
	          menuCadastro.add(produto);menuCadastro.add(funcionario);menuCadastro.add(cliente);menuCadastro.add(fornecedor);menuCadastro.add(conta);menuCadastro.add(serviço);menuCadastro.add(tamanho);menuCadastro.add(categoria);menuCadastro.add(tipo);menuCadastro.add(cor);
	          mb.add(menuVenda);
		       mb.add(menuAluguel);
		       mb.add(menuCadastro);
		          this.setJMenuBar(mb);
	
		          
		          JMenu menuConsulta;
		         JMenuItem codigoBarras, consultaProduto, consultaServiço, consultaVenda, consultaCliente, consultaFornecedor, estoque, entregasPendentes, consultaAlugados;
		         menuConsulta = new JMenu("Consulta");
		         codigoBarras = new JMenuItem("Codigo de Barras");
		         consultaProduto = new JMenuItem("Produto");
		         consultaServiço = new JMenuItem("Serviço");
		         consultaVenda = new JMenuItem("Venda");
		         consultaCliente = new JMenuItem("Cliente");
		         consultaFornecedor = new JMenuItem("Fornecedor");
		         estoque = new JMenuItem("Estoque");
		         entregasPendentes = new JMenuItem("Pendentes");
		         consultaAlugados = new JMenuItem("Alugados");
		         menuConsulta.add(codigoBarras);menuConsulta.add(consultaProduto);menuConsulta.add(consultaServiço);menuConsulta.add(consultaVenda);menuConsulta.add(consultaCliente);menuConsulta.add(consultaFornecedor);menuConsulta.add(estoque);menuConsulta.add(entregasPendentes);menuConsulta.add(consultaAlugados);
		         
			          
			          JMenu menuAlteracao;
			          JMenuItem alteracaoProduto, alteracaoFuncionario, alteracaCliente, alteracaoFornecedor, alteracaoConta, alteracaoServiço;
			          menuAlteracao = new JMenu("Alteração");
			          alteracaoProduto = new JMenuItem("Produto");
			          alteracaoFuncionario = new JMenuItem("Funcionario");
			          alteracaCliente = new JMenuItem("Cliente");
			          alteracaoFornecedor = new JMenuItem("Fornecedor");
			          alteracaoConta = new JMenuItem("Conta");
			          alteracaoServiço = new JMenuItem("Serviço");
			          menuAlteracao.add(alteracaoProduto);menuAlteracao.add(alteracaoFuncionario);menuAlteracao.add(alteracaCliente);menuAlteracao.add(alteracaoFornecedor);menuAlteracao.add(alteracaoConta);menuAlteracao.add(alteracaoServiço);
			          mb.add(menuVenda);
				       mb.add(menuAluguel);
				       mb.add(menuCadastro);
				       mb.add(menuConsulta);
				       mb.add(menuAlteracao);
				          this.setJMenuBar(mb);     
			          
			          JMenu menuRelatorio;
			          JMenuItem relatorioVendas, relatorioEstoque, relatorioEntregas, aReceberAPagar, fluxoCaixa, faturamento, compras, comissão, descontos, frete, parceria, cortesia, aluguel, atrasados;
			          menuRelatorio = new JMenu("Relatorio");
			          relatorioVendas = new JMenuItem("Vendas");
			          relatorioEstoque = new JMenuItem("Estoque");
			          relatorioEntregas = new JMenuItem("Entregas");
			          aReceberAPagar = new JMenuItem("A Receber/A Pagar");
			          fluxoCaixa = new JMenuItem("Fluxo de Caixa");
			          faturamento = new JMenuItem("Faturamento");
			          compras = new JMenuItem("Compras");
			          comissão = new JMenuItem("Comissão");
			          descontos = new JMenuItem("Descontos");
			          frete = new JMenuItem("Frete");
			          parceria = new JMenuItem("Parceria");
			          cortesia = new JMenuItem("Cortesia");
			          aluguel = new JMenuItem("Aluguel");
			          atrasados = new JMenuItem("Atrasados");
			          menuRelatorio.add(relatorioVendas);menuRelatorio.add(relatorioEstoque);menuRelatorio.add(relatorioEntregas);menuRelatorio.add(aReceberAPagar);menuRelatorio.add(fluxoCaixa);menuRelatorio.add(faturamento);menuRelatorio.add(compras);menuRelatorio.add(comissão);menuRelatorio.add(descontos);menuRelatorio.add(frete);menuRelatorio.add(parceria);menuRelatorio.add(cortesia);menuRelatorio.add(aluguel);menuRelatorio.add(atrasados);
			          mb.add(menuVenda);
				       mb.add(menuAluguel);
				       mb.add(menuCadastro);
				       mb.add(menuConsulta);
				       mb.add(menuAlteracao);
				       mb.add(menuRelatorio);
				          this.setJMenuBar(mb);
			          
				          JMenu menuFinancas;
				          JMenuItem controleCaixa, contasReceberPagar;
				          menuFinancas = new JMenu("Finanças");
				          controleCaixa = new JMenuItem("Controle de Caixa");
				          contasReceberPagar = new JMenuItem("Contas a Receber/Pagar");
				          menuFinancas.add(controleCaixa);
				          menuFinancas.add(contasReceberPagar);
				          
				          mb.add(menuVenda);
					       mb.add(menuAluguel);
					       mb.add(menuCadastro);
					       mb.add(menuConsulta);
					       mb.add(menuAlteracao);
					       mb.add(menuRelatorio);
					       mb.add(menuFinancas);
					          this.setJMenuBar(mb);
				          
	}
}
