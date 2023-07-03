package ejecutable;

import java.util.HashMap;

import javax.swing.JOptionPane;

import clases.MonedaValor;


public class ConversorMain {

	public static void main(String[] args) {

		String[] opcMenuPrincipal = {"Conversor de moneda", "Conversor de temperatura"};
		
		String seleccion1=(String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.INFORMATION_MESSAGE,
				null, opcMenuPrincipal, opcMenuPrincipal[0]);
		
		if(seleccion1==opcMenuPrincipal[0]) {//Convertir moneda
			float dineroConvertir;
			boolean exception=true;;
			
			while(exception) {
				try {
					//Solicitar cantidad de dinero a convertir.
					dineroConvertir=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir: ", "Ingreso de datos",
							JOptionPane.INFORMATION_MESSAGE, null, null, 0.00).toString());
					exception=false;
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Ingrese un dato numérico.");
				}catch(NullPointerException e) {//Opción de cancelar
					exception=false;
				}
			}
			
			
			
		}
		else if(seleccion1==opcMenuPrincipal[1]) {//Convertir temperatura
			
		}
	}
}
