package br.com.babalook.util;

import java.text.ParseException;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JDateChooser;

import br.com.babalook.model.Cargo;
import br.com.babalook.model.Contrato;
import br.com.babalook.model.Departamento;
import br.com.babalook.model.Escolaridade;
import br.com.babalook.model.FollhaPagamento;
import br.com.babalook.model.HorarioTrabalho;

public class TabDadosContrato {
	
	private JTextField jtxMatricula;
	private JTextField jtxCTPS;
	private JTextField jtxSerieCTPS;
	private JTextField jtxFormacao;
	private JFormattedTextField jtxSalario;
	private JTextField jtxComissao;
	
	Currencies curreny = new Currencies();
	
	public void dadosContrato(JPanel jpDadosPessoais, JPanel jpDadosContrato, JTabbedPane jtpTabs) {
		// tab Dados do Contrato
		jtpTabs.addTab("Dados do Contrato", jpDadosContrato);
		jpDadosContrato.setLayout(null);
		
		JLabel label = new JLabel("%");
		label.setBounds(399, 115, 17, 15);
		jpDadosContrato.add(label);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(60, 12, 71, 15);
		jpDadosContrato.add(lblMatricula);

		jtxMatricula = new JTextField();
		jtxMatricula.setBounds(144, 10, 124, 19);
		jpDadosContrato.add(jtxMatricula);
		jtxMatricula.setColumns(10);

		JLabel lblDepartamento = new JLabel("Departamento:");
		lblDepartamento.setBounds(23, 39, 108, 15);
		jpDadosContrato.add(lblDepartamento);

		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(84, 62, 47, 15);
		jpDadosContrato.add(lblCargo);

		JComboBox<Departamento> jcombDepartamento = new JComboBox<>();
		jcombDepartamento.setBounds(144, 30, 124, 24);
		jcombDepartamento.setModel(new DefaultComboBoxModel<Departamento>(Departamento.values()));
		
		
		jpDadosContrato.add(jcombDepartamento);

		JComboBox<Cargo> jcombCargo = new JComboBox<>();
		jcombCargo.setBounds(144, 57, 124, 24);
		jpDadosContrato.add(jcombCargo);
		jcombCargo.setModel(new DefaultComboBoxModel<Cargo>(Cargo.values()));

		JLabel lblRegime = new JLabel("Regime:");
		lblRegime.setBounds(74, 89, 57, 15);
		jpDadosContrato.add(lblRegime);

		JComboBox<Contrato> jcombRegime = new JComboBox<>();
		jcombRegime.setBounds(144, 84, 124, 24);
		jpDadosContrato.add(jcombRegime);
		jcombRegime.setModel(new DefaultComboBoxModel<Contrato>(Contrato.values()));

		JLabel lblCtps = new JLabel("CTPS:");
		lblCtps.setBounds(91, 115, 40, 15);
		jpDadosContrato.add(lblCtps);

		try {
			jtxCTPS = new JFormattedTextField(new MaskFormatter("########"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jtxCTPS.setBounds(144, 113, 124, 19);
		jpDadosContrato.add(jtxCTPS);
		jtxCTPS.setColumns(10);

		JLabel lblSeriectps = new JLabel("Serie CTPS:");
		lblSeriectps.setBounds(50, 139, 81, 15);
		jpDadosContrato.add(lblSeriectps);

		try {
			jtxSerieCTPS = new JFormattedTextField(new MaskFormatter("#####"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jtxSerieCTPS.setBounds(144, 137, 124, 19);
		jpDadosContrato.add(jtxSerieCTPS);
		jtxSerieCTPS.setColumns(10);

		JLabel lblPagamento = new JLabel("Pagamento:");
		lblPagamento.setBounds(38, 164, 93, 15);
		jpDadosContrato.add(lblPagamento);

		JComboBox<FollhaPagamento> jcombPagamento = new JComboBox<>();
		jcombPagamento.setBounds(144, 159, 124, 24);
		jpDadosContrato.add(jcombPagamento);
		jcombPagamento.setModel(new DefaultComboBoxModel<FollhaPagamento>(FollhaPagamento.values()));

		JLabel lblEscolaridade = new JLabel("Escolaridade:");
		lblEscolaridade.setBounds(300, 12, 96, 15);
		jpDadosContrato.add(lblEscolaridade);

		JComboBox<Escolaridade> jcombEscolaridade = new JComboBox<>();
		jcombEscolaridade.setBounds(414, 7, 134, 24);
		jpDadosContrato.add(jcombEscolaridade);
		jcombEscolaridade.setModel(new DefaultComboBoxModel<Escolaridade>(Escolaridade.values()));
		

		JLabel lblFormao = new JLabel("Formação:");
		lblFormao.setBounds(322, 39, 86, 15);
		jpDadosContrato.add(lblFormao);

		jtxFormacao = new JTextField();
		jtxFormacao.setBounds(414, 37, 134, 19);
		jpDadosContrato.add(jtxFormacao);
		jtxFormacao.setColumns(10);

		JLabel lblExpediente = new JLabel("Expediente:");
		lblExpediente.setBounds(310, 62, 86, 15);
		jpDadosContrato.add(lblExpediente);

		JComboBox<HorarioTrabalho> jcombExpediente = new JComboBox<>();
		jcombExpediente.setBounds(414, 57, 134, 24);
		jpDadosContrato.add(jcombExpediente);
		jcombExpediente.setModel(new DefaultComboBoxModel<HorarioTrabalho>(HorarioTrabalho.values()));

		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(339, 89, 57, 15);
		jpDadosContrato.add(lblSalario);

		jtxSalario = new JFormattedTextField(curreny.numberFormatter());
		jtxSalario.setFormatterFactory(new DefaultFormatterFactory(curreny.numberFormatter()));
		jtxSalario.setBounds(414, 87, 134, 19);
		jpDadosContrato.add(jtxSalario);
		jtxSalario.setColumns(10);

		JLabel lblComisso = new JLabel("Comissão:");
		lblComisso.setBounds(322, 115, 74, 15);
		jpDadosContrato.add(lblComisso);

		jtxComissao = new JTextField();
		
		jtxComissao.setBounds(414, 113, 134, 19);
		jpDadosContrato.add(jtxComissao);
		jtxComissao.setColumns(10);

		JLabel lblAdmisso = new JLabel("Admissão:");
		lblAdmisso.setBounds(322, 139, 74, 15);
		jpDadosContrato.add(lblAdmisso);

		JLabel lblDemisso = new JLabel("Demissão:");
		lblDemisso.setBounds(322, 164, 74, 15);
		jpDadosContrato.add(lblDemisso);

		JPanel jpBeneficios = new JPanel();
		jpBeneficios.setBorder(UIManager.getBorder("CheckBox.border"));
		jpBeneficios.setBounds(586, 0, 196, 179);
		jpDadosContrato.add(jpBeneficios);
		jpBeneficios.setLayout(null);

		JLabel lblBenefcios = new JLabel("Benefícios");
		lblBenefcios.setBounds(63, 12, 81, 15);
		jpBeneficios.add(lblBenefcios);

		JCheckBox jchkbValeTransporte = new JCheckBox("Vale Transporte");
		jchkbValeTransporte.setBounds(8, 35, 153, 23);
		jpBeneficios.add(jchkbValeTransporte);

		JCheckBox jchkbValeAlimentacao = new JCheckBox("Vale Alimentação");
		jchkbValeAlimentacao.setBounds(8, 62, 153, 23);
		jpBeneficios.add(jchkbValeAlimentacao);

		JCheckBox jchkbValeRefeicao = new JCheckBox("Vale Refeição");
		jchkbValeRefeicao.setBounds(8, 89, 129, 23);
		jpBeneficios.add(jchkbValeRefeicao);

		JCheckBox jchkbPlanoSaude = new JCheckBox("Plano de Saúde");
		jchkbPlanoSaude.setBounds(8, 116, 136, 23);
		jpBeneficios.add(jchkbPlanoSaude);

		JCheckBox jchkbOutros = new JCheckBox("Outros");
		jchkbOutros.setBounds(8, 143, 129, 23);
		jpBeneficios.add(jchkbOutros);
		jpDadosPessoais.setLayout(null);

		JDateChooser jdataAdmissao = new JDateChooser();
		jdataAdmissao.setBounds(414, 139, 134, 19);
		jpDadosContrato.add(jdataAdmissao);
		jdataAdmissao.setLocale(new Locale("pt", "BR"));

		JDateChooser jdataDemissao = new JDateChooser();
		jdataDemissao.setBounds(414, 164, 134, 19);
		jpDadosContrato.add(jdataDemissao);
		jdataDemissao.setLocale(new Locale("pt", "BR"));
	}

}
