package br.com.babalook.util;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JOptionPane;

public class ValidaEmail {
	
	public boolean validacaoEmail(String email) {
	    boolean result = true;
	    try {
	        InternetAddress emailAddr = new InternetAddress(email);
	        emailAddr.validate();
	    } catch (AddressException ex) {
	        result = false;
	    }
	    return result;
	}
}
