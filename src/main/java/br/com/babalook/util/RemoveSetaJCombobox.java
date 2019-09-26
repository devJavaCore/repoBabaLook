package br.com.babalook.util;

import java.awt.Component;
import java.awt.Container;

import javax.swing.AbstractButton;

public class RemoveSetaJCombobox {
	
	   public static void removeArrow(Container container) {
		      Component[] c = container.getComponents();
		      for (Component res : c) {
		         if (res instanceof AbstractButton) {
		            container.remove(res);
		         }
		      }
		   }
}
