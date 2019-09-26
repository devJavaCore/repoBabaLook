package br.com.babalook.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

public class Currencies {


    
    public NumberFormatter numberFormatter() {

		DecimalFormat dFormat = new DecimalFormat("#,###,###.00") ;
		NumberFormatter numberFormatter = new NumberFormatter(dFormat);
		numberFormatter.setFormat(dFormat);
		numberFormatter.setAllowsInvalid(false);
    	return numberFormatter;
    }
    
    
}