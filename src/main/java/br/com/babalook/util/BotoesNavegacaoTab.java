package br.com.babalook.util;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import br.com.babalook.view.JFrmCadastroFuncionarios;


public class BotoesNavegacaoTab {
		
	TabDadosPessoais tabDadosPessoais = new TabDadosPessoais();
	JOptionConfirmacoes jOptionConfirmacoes = new JOptionConfirmacoes();
	
	
	public void btnCancelaProximo(JPanel jpTab, JTabbedPane jtpTabs, JFrame jFrame, int proximo) {
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtpTabs.setSelectedIndex(proximo);
			}
		});
		btnProximo.setBounds(277, 207, 101, 25);
		jpTab.add(btnProximo);

		JButton btnCancela = new JButton("Cancelar");
		btnCancela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { 
				jFrame.dispose();
			}
		});
		btnCancela.setBounds(122, 207, 99, 25);
		jpTab.add(btnCancela);	
	}
	
	
	
	public void btnAnteriorProximo(JPanel jpTab, JTabbedPane jtpTabs, JFrame jFrame, int proximo, int anterior) {
		JButton jbtnProximoDois = new JButton("Proximo");
		jbtnProximoDois.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jtpTabs.setSelectedIndex(proximo);

			}
		});
		jbtnProximoDois.setBounds(273, 206, 117, 25);
		jpTab.add(jbtnProximoDois);

		JButton jbtnAnterior = new JButton("Anterior");
		jbtnAnterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				jtpTabs.setSelectedIndex(anterior);
			}
		});
		jbtnAnterior.setBounds(122, 207, 99, 25);
		jpTab.add(jbtnAnterior);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				jFrame.dispose();
			}
		});
		btnCancelar.setBounds(12, 206, 99, 25);
		jpTab.add(btnCancelar);
	}
	
	
	public void btnCancelaAnteriorConfirma(JPanel jpTab, JTabbedPane jtpTabs, JFrame jFrame, int anterior) {
		JButton jbtnConfirma = new JButton("Confirma");
		jbtnConfirma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					
				
				if (tabDadosPessoais.getJtxNome().getText().isEmpty()) {
					jtpTabs.setSelectedIndex(0);
					tabDadosPessoais.getJtxNome().setBorder(new LineBorder(Color.red, 1));
					JOptionPane.showMessageDialog(null, "Campo Nome Obrigatório na Tab Dados Pessoais!", "Erro no Preenchimento dos Dados", JOptionPane.DEFAULT_OPTION);
				} else {
					
					jOptionConfirmacoes.jOptionConfirmaAlteracoes();	
				}
			}
		});
		
		
		
		jbtnConfirma.setBounds(273, 206, 117, 25);
		jpTab.add(jbtnConfirma);

		JButton jbtnAnteriorTres = new JButton("Anterior");
		jbtnAnteriorTres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				jtpTabs.setSelectedIndex(anterior);
			}
		});
		jbtnAnteriorTres.setBounds(122, 207, 99, 25);
		jpTab.add(jbtnAnteriorTres);

		
		JButton btnCancelando = new JButton("Cancelar");
		btnCancelando.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				jFrame.dispose();
			}
		});
		btnCancelando.setBounds(12, 206, 99, 25);
		jpTab.add(btnCancelando);
	}


}
