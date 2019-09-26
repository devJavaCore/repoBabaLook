package br.com.babalook.util;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JBtnImageIcon {

	public void imageButton(JButton jButton, String caminho) {
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			InputStream input = classLoader.getResourceAsStream(caminho);
			// URL input = classLoader.getResource("image.png"); // <-- You can use URL
			// class too.
			BufferedImage image = ImageIO.read(input);

			jButton.setBorder(BorderFactory.createEmptyBorder());
			jButton.setBackground(Color.LIGHT_GRAY);
			jButton.setBorder(BorderFactory.createEmptyBorder(1, 8, 1, 1));
			jButton.setIcon(new ImageIcon(image));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
