package br.com.babalook.util;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import br.com.babalook.view.JFrmCadastroFuncionarios;

public class TabDadosPessoais {
	private static JTextField jtxNome;
	private JTextField jtxCpf;
	private JTextField jtxTelFixo;
	private JTextField jtxCelular;
	private JTextField jtxEmail;
	private static String auxJtxNome;

	ValidaEmail validaEmail = new ValidaEmail();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public void dadosPessoais(JPanel jpDadosPessoais, JTabbedPane jtpTabs) {
		jtpTabs.addTab("Dados Pessoais", jpDadosPessoais);
		jpDadosPessoais.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(63, 12, 50, 15);
		jpDadosPessoais.add(lblNome);

		jtxNome = new JTextField();
		jtxNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				jtxNome.setBorder(new LineBorder(Color.black, 1));
				auxJtxNome = jtxNome.getText();
			}
		});
		jtxNome.setBounds(122, 10, 256, 19);
		jpDadosPessoais.add(jtxNome);
		jtxNome.setColumns(10);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(73, 43, 40, 15);
		jpDadosPessoais.add(lblCpf);

		try {
			jtxCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jtxCpf.setBounds(122, 41, 130, 19);
		jpDadosPessoais.add(jtxCpf);
		jtxCpf.setColumns(10);

		JLabel lblTelefoneFixo = new JLabel("Telefone Fixo:");
		lblTelefoneFixo.setBounds(12, 74, 101, 15);
		jpDadosPessoais.add(lblTelefoneFixo);

		try {
			jtxTelFixo = new JFormattedTextField(new MaskFormatter("(##) ####-####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jtxTelFixo.setBounds(122, 72, 130, 19);
		jpDadosPessoais.add(jtxTelFixo);
		jtxTelFixo.setColumns(10);

		JLabel lblTelefoneCelular = new JLabel("Celular:");
		lblTelefoneCelular.setBounds(58, 101, 55, 15);
		jpDadosPessoais.add(lblTelefoneCelular);

		try {
			jtxCelular = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jtxCelular.setBounds(122, 103, 130, 19);
		jpDadosPessoais.add(jtxCelular);
		jtxCelular.setColumns(10);

		JLabel lblEmail = new JLabel("email:");
		lblEmail.setBounds(63, 136, 50, 15);
		jpDadosPessoais.add(lblEmail);

		jtxEmail = new JTextField();
		jtxEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				try {
					if (validaEmail.validacaoEmail(jtxEmail.getText())) {
						jtxEmail.setForeground(Color.black);
					} else {
						jtxEmail.setForeground(Color.red);
					}
				} catch (Exception e) {
				}
			}
		});
		jtxEmail.setBounds(122, 134, 256, 19);
		jpDadosPessoais.add(jtxEmail);
		jtxEmail.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(63, 171, 50, 15);
		jpDadosPessoais.add(lblSexo);

		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		buttonGroup.add(rdbtnMasculino);
		rdbtnMasculino.setBounds(120, 167, 101, 23);
		jpDadosPessoais.add(rdbtnMasculino);

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		buttonGroup.add(rdbtnFeminino);
		rdbtnFeminino.setBounds(229, 167, 94, 23);
		jpDadosPessoais.add(rdbtnFeminino);

	}

	public JTextField getJtxNome() {
		return jtxNome;
	}
}
