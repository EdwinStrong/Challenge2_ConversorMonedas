package ejecutable;

import java.util.HashMap;

import javax.swing.JOptionPane;

import clases.MonedaValor;


public class ConversorMain {

	public static void main(String[] args) {

		String[] opcMenuPrincipal = {"Conversor de moneda", "Conversor de temperatura"};

		String seleccion=(String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.INFORMATION_MESSAGE,
				null, opcMenuPrincipal, opcMenuPrincipal[0]);

		if(seleccion==opcMenuPrincipal[0]) {//Convertir moneda
			float dineroConvertir=-1;
			boolean exception=true;;

			while(exception | dineroConvertir < 0) {
				try {
					//Solicitar cantidad de dinero a convertir.
					String input=(String) JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir: ", "Ingreso de datos",
							JOptionPane.INFORMATION_MESSAGE, null, null, 0.00);
					if(input==null) {//Opción de cancelar.
						exception=false;
					}
					else {
						dineroConvertir=Float.parseFloat(input);
						exception=false;
					}

				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Ingrese un dato numérico.");
				}

			}
		}
		
		else if(seleccion==opcMenuPrincipal[1]) {//Convertir temperatura

		}
	}
}
