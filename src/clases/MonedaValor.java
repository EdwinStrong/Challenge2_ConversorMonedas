package clases;

public class MonedaValor {
	
	private float[] valorMoneda = {0.0584233f, 0.0534826f, 0.0458863f, 8.44455f, 76.81f};
	
	/**
	 * Realiza la conversión a la moneda:
	 * 1. Dolar,
	 * 2. Euro,
	 * 3. Libra esterlina,
	 * 4. Yen Japonés,
	 * 5. Won Coreano,
	 * @param pesoMexicano Cantidad de dinero a convertir,
	 * @param tipoConversion Numero que define a cuál moneda se va a convertir.
	 * @return Cantidad de peso mexicano convertido.
	 * @throws monedaException La opción del tipo de conversión es inválida.
	 */
	public float convertirMoneda(int tipoConversion, float pesoMexicano) throws monedaException {
		for(int i=1; i<=this.valorMoneda.length; i++) {
			if(tipoConversion==i) {
				return pesoMexicano*valorMoneda[i-1];//Retorna el valor de la moneda convertida.
			}
		}
		throw new monedaException("Opcion de conversion no valida.");
	}
	
	
}
