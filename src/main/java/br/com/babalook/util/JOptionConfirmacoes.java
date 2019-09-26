package br.com.babalook.util;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class JOptionConfirmacoes {
	

	public void jOptionConfirmaAlteracoes() {
		JDialog.setDefaultLookAndFeelDecorated(true);
		Object[] options = { "Sim", "Não" };
		int response = JOptionPane.showOptionDialog(null, "Confirma a Alteração?", "Alerta!",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

		if (response == JOptionPane.NO_OPTION) {

		} else if (response == JOptionPane.YES_OPTION) {
			System.exit(0);

		} else if (response == JOptionPane.CLOSED_OPTION) {
			System.out.println("JOptionPane closed");
		}
	}
}
