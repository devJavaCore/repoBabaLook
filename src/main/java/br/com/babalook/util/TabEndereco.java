package br.com.babalook.util;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TabEndereco {
	
	private JTextField jTxtCep;
	private JLabel lblLogradouro;
	private JLabel lblEstado;
	private JLabel lblBairro;
	private JTextField jTxtCidade;
	private JTextField jTxtEstado;
	private JTextField jTxtBairro;
	private JLabel lblLogradouro_1;
	private JLabel lblNmero;
	private JTextField jTxtLogradouro;
	private JTextField jTxNumero;
	
	ConectaCep conectaCep = new ConectaCep();
	
	public void endereco(JPanel jpEndereco, JTabbedPane jtpTabs) {
		jtpTabs.addTab("Endereço", jpEndereco);
		jpEndereco.setLayout(null);

		JLabel lblInformaCep = new JLabel("Informe o Cep");
		lblInformaCep.setBounds(32, 0, 98, 15);
		jpEndereco.add(lblInformaCep);

		try {
			jTxtCep = new JFormattedTextField(new MaskFormatter("#####-###"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jTxtCep.setBounds(32, 22, 126, 19);
		jpEndereco.add(jTxtCep);
		jTxtCep.setColumns(10);

		lblLogradouro = new JLabel("Cidade");
		lblLogradouro.setBounds(32, 49, 70, 15);
		jpEndereco.add(lblLogradouro);

		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(273, 49, 70, 15);
		jpEndereco.add(lblEstado);

		lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(32, 96, 70, 15);
		jpEndereco.add(lblBairro);

		jTxtCidade = new JTextField();
		jTxtCidade.setBounds(32, 65, 229, 19);
		jpEndereco.add(jTxtCidade);
		jTxtCidade.setColumns(10);

		jTxtEstado = new JTextField();
		jTxtEstado.setBounds(273, 65, 114, 19);
		jpEndereco.add(jTxtEstado);
		jTxtEstado.setColumns(10);

		jTxtBairro = new JTextField();
		jTxtBairro.setBounds(32, 112, 229, 19);
		jpEndereco.add(jTxtBairro);
		jTxtBairro.setColumns(10);

		lblLogradouro_1 = new JLabel("Logradouro");
		lblLogradouro_1.setBounds(32, 140, 98, 15);
		jpEndereco.add(lblLogradouro_1);

		lblNmero = new JLabel("Número");
		lblNmero.setBounds(273, 140, 70, 15);
		jpEndereco.add(lblNmero);

		jTxtLogradouro = new JTextField();
		jTxtLogradouro.setBounds(32, 162, 226, 19);
		jpEndereco.add(jTxtLogradouro);
		jTxtLogradouro.setColumns(10);

		jTxNumero = new JTextField();
		jTxNumero.setBounds(273, 162, 114, 19);
		jpEndereco.add(jTxNumero);
		jTxNumero.setColumns(10);

		JButton jbtnBuscar = new JButton("Buscar");
		jbtnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				try {
					conectaCep.buscarCep(jTxtCep.getText());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				jTxtLogradouro.setText(conectaCep.getLogradouro());
				jTxtBairro.setText(conectaCep.getBairro());
				jTxtCidade.setText(conectaCep.getCidade());
				jTxtEstado.setText(conectaCep.getUf());

			}
		});
		jbtnBuscar.setBounds(170, 19, 117, 25);
		jpEndereco.add(jbtnBuscar);
	}


}
