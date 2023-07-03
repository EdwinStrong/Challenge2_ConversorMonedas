package ejecutable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import clases.MonedaException;
import clases.MonedaValor;
import clases.MonedaNombreEnum;


public class ConversorMain {
	
	/**-
	 * Este método se encarga de definir el nombre de las monedas en plural para mostrar la conversión..
	 * @param nombreMoneda proviene de la clase enum encargada de definir la cantidad de monedas utilizadas.
	 * @return String que contiene el nombre en plural de cada moneda.
	 */
	public static String obtenerNombreMonedas(MonedaNombreEnum nombreMoneda) {
		String moneda = null;
		switch (nombreMoneda) {
		case DOLAR:
			moneda="Dólares";
			break;
		case EURO:
			moneda="Euros";
			break;
		case LIBRA_ESTERLINA:
			moneda="Libras esterlinas";
			break;
		case YEN_JAPONES:
			moneda = "Yen Japonés";
			break;
		case WON_COREANO:
			moneda = "Won coreano";
			break;
		default:
			moneda="Dolares";
			break;
		}
		return moneda;
	}

	public static void main(String[] args) throws MonedaException {

		String[] opcMenuPrincipal = {"Conversor de moneda", "Conversor de temperatura"};
		
		//Opciones de conversiones
		String seleccion=(String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.INFORMATION_MESSAGE,
				null, opcMenuPrincipal, opcMenuPrincipal[0]);

		if(seleccion==opcMenuPrincipal[0]) {//Convertir moneda
			
			HashMap<Integer, String> opcConversion = new HashMap<>();//Hashmap de opciones de conversión de monedas.

			MonedaValor monedaConversion=new MonedaValor();//Instancia de clase para conversiones.
			
			MonedaNombreEnum[] nombreMoneda=MonedaNombreEnum.values();//Array de valores constantes de nombres de monedas.
			
			//Llenar hashmap que contiene opciones de conversión.
			for (int i=0; i<nombreMoneda.length; i++) {
				opcConversion.put(i, "De pesos a " + nombreMoneda[i].toString().toLowerCase().replace("_", " "));
			}
			
			//Variables de apoyo
			float dineroConvertir=-1;//Cantidad de pesos mexicanos que se quieren convertir.
			boolean exception=true;;

			while(exception || dineroConvertir < 0) {
				try {
					//Solicitar cantidad de dinero a convertir.
					String input=(String) JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir: ", "Ingreso de datos",
							JOptionPane.INFORMATION_MESSAGE, null, null, 0.00);
					if(input==null) {//Opción de cancelar.
						break;
					}
					else {
						dineroConvertir=Float.parseFloat(input);
						exception=false;
					}

				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Ingrese un dato numérico.");
				}
			}

			//Convertir hashmap a Array
			List<String> valores = new ArrayList<>(opcConversion.values());//Hashmap a lista dinámica

			Object[] opcionesArray = valores.toArray();//lista dinámica a array

			String seleccionConversion = (String) JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.INFORMATION_MESSAGE,
					null, opcionesArray, opcionesArray[0]);//Me retorna el valor del String del hashmap

			if(seleccionConversion != null) {//Diferente a "Cancelar"
				//String[] moneda= {"Dolares","Euros","Libras esterlinas","Yen japonés","Won Coreano"};
				for (int i=0; i<opcConversion.size(); i++) {
					if(opcConversion.get(i)==seleccionConversion) {//Obtener indice de conversion
						String mensaje=String.format("$%.3f pesos mexicanos son $%.3f %s", dineroConvertir, monedaConversion.convertirMoneda(i, dineroConvertir), 
								obtenerNombreMonedas(nombreMoneda[i]));
						JOptionPane.showMessageDialog(null, mensaje);
					}
				}
			}

		}

		else if(seleccion==opcMenuPrincipal[1]) {//Convertir temperatura

		}
	}
}
