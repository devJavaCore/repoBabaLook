package br.com.babalook.util;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CentralizaJFrame {
	public void centralizarJframe(JFrame jFrame) {
		//Centralizar JFrame
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int xPos = (dim.width / 2) - (jFrame.getWidth() / 2);
		int yPos = (dim.height / 2) - (jFrame.getHeight() / 2);
		jFrame.setLocation(xPos, yPos);
	}

}
