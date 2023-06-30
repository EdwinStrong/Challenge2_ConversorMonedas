package ejecutable;

import javax.swing.JOptionPane;

import clases.MonedaValor;
import clases.monedaException;


public class ConversorMain {
	public static void main(String[] args) {
		MonedaValor conversion=new MonedaValor();

		String[] opciones = {"Convertir Monedas", "Convertir Temperatura"};
		String[] monedasName = {"Dolar", "Euros", "Libras", "Yen", "Won coreano"};

		// Mostrar el cuadro de selección y obtener la opción seleccionada
		String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción de conversión",
				"Menú", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		
		// Realizar la acción correspondiente a la opción seleccionada
		if (seleccion != null) {
			
			if (seleccion.equals(opciones[0])) {//Moneadas
				// Lógica para convertir monedas
				JOptionPane.showMessageDialog(null, "Convertir Monedas");
				
				JOptionPane.showInputDialog("Ingresa la cantidad que deseas convertir: ", "0.00");//Valor numérico
				 
			}
			
			else if (seleccion.equals(opciones[1])) {//Temperatura
				// Lógica para convertir temperatura
				JOptionPane.showMessageDialog(null, "Convertir Temperatura");
			}
		}

		
		/*
		try {
			JOptionPane.showMessageDialog(null, "El valor de la conversión de 100 mx son: "+conversion.convertirMoneda(5, 100)+" dólares.");
		} catch (monedaException e) {
			System.out.println("Error en conversion.");
			e.printStackTrace();
		}

		System.out.println("Funciona?");
		*/
	}
}
