package br.com.babalook.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.toedter.calendar.JDateChooser;

import br.com.babalook.model.EstadoCivil;

public class TabDadosFuncionario {

	private JTextField jtxNomeUsuario;
	private JTextField jtxNomePai;
	private JTextField jtxNomeMae;
	private JTextField jtxNacionalidade;
	private JTextField jtxNaturalidade;
	private JTextField jtxRG;

	public void dadosFuncionario(JPanel jpDadosContrato, JPanel jpDadosFuncionario, JTabbedPane jtpTabs) {
		// tab Dados do Funcionario
		jtpTabs.addTab("Dados do Funcionario", jpDadosFuncionario);
		jpDadosFuncionario.setLayout(null);

		JLabel lblNomeDeUsurio = new JLabel("Nome de Usuário:");
		lblNomeDeUsurio.setBounds(22, 12, 133, 15);
		jpDadosFuncionario.add(lblNomeDeUsurio);

		jtxNomeUsuario = new JTextField();
		jtxNomeUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
		});
		jtxNomeUsuario.setBounds(159, 10, 149, 19);
		jpDadosFuncionario.add(jtxNomeUsuario);
		jtxNomeUsuario.setColumns(10);

		JLabel lblNomeDoPai = new JLabel("Nome do Pai:");
		lblNomeDoPai.setBounds(53, 39, 102, 15);
		jpDadosFuncionario.add(lblNomeDoPai);

		jtxNomePai = new JTextField();
		jtxNomePai.setBounds(159, 37, 149, 19);
		jpDadosFuncionario.add(jtxNomePai);
		jtxNomePai.setColumns(10);

		JLabel lblNomeDaMe = new JLabel("Nome da Mãe:");
		lblNomeDaMe.setBounds(47, 66, 108, 15);
		jpDadosFuncionario.add(lblNomeDaMe);

		jtxNomeMae = new JTextField();
		jtxNomeMae.setBounds(159, 64, 149, 19);
		jpDadosFuncionario.add(jtxNomeMae);
		jtxNomeMae.setColumns(10);

		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(63, 93, 92, 15);
		jpDadosFuncionario.add(lblEstadoCivil);

		JComboBox<EstadoCivil> jtxEstadoCivil = new JComboBox<>();
		jtxEstadoCivil.setBounds(159, 88, 149, 24);
		jpDadosFuncionario.add(jtxEstadoCivil);
		jtxEstadoCivil.setModel(new DefaultComboBoxModel<EstadoCivil>(EstadoCivil.values()));

		JLabel lblNacionalidade = new JLabel("Nacionalidade:");
		lblNacionalidade.setBounds(47, 120, 108, 15);
		jpDadosFuncionario.add(lblNacionalidade);

		jtxNacionalidade = new JTextField();
		jtxNacionalidade.setBounds(159, 118, 149, 19);
		jpDadosFuncionario.add(jtxNacionalidade);
		jtxNacionalidade.setColumns(10);

		JLabel lblNaturalidade = new JLabel("Naturalidade:");
		lblNaturalidade.setBounds(53, 147, 102, 15);
		jpDadosFuncionario.add(lblNaturalidade);

		jtxNaturalidade = new JTextField();
		jtxNaturalidade.setBounds(159, 145, 149, 19);
		jpDadosFuncionario.add(jtxNaturalidade);
		jtxNaturalidade.setColumns(10);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(364, 12, 155, 15);
		jpDadosFuncionario.add(lblDataDeNascimento);

		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(485, 39, 34, 15);
		jpDadosFuncionario.add(lblRg);

		jtxRG = new JTextField();
		jtxRG.setBounds(526, 38, 167, 19);
		jpDadosFuncionario.add(jtxRG);
		jtxRG.setColumns(10);

		JLabel lblObservaes = new JLabel("Observações:");
		lblObservaes.setBounds(411, 66, 108, 15);
		jpDadosFuncionario.add(lblObservaes);

		JScrollPane jscrObsDadosFuncionario = new JScrollPane();
		jscrObsDadosFuncionario.setBounds(526, 66, 166, 89);
		jpDadosFuncionario.add(jscrObsDadosFuncionario);

		JTextPane textPane = new JTextPane();
		jscrObsDadosFuncionario.setViewportView(textPane);
		jpDadosContrato.setLayout(null);

		JDateChooser jdataNascimento = new JDateChooser();
		jdataNascimento.setBounds(526, 12, 167, 19);
		jpDadosFuncionario.add(jdataNascimento);
		jdataNascimento.setLocale(new Locale("pt", "BR"));
	}

}
