package clases;

public class MonedaValor {
	
	private float[] valorMoneda = {0.0584233f, 0.0534826f, 0.0458863f, 8.44455f, 76.81f};
	
	/**
	 * Realiza la conversión a la moneda:
	 * 0. Dolar,
	 * 1. Euro,
	 * 2. Libra esterlina,
	 * 3. Yen Japonés,
	 * 4. Won Coreano.
	 * @param pesoMexicano Cantidad de dinero a convertir.
	 * @param tipoConversion Numero que define a cuál moneda se va a convertir.
	 * @return Cantidad de peso mexicano convertido.
	 * @throws MonedaException La opción del tipo de conversión es inválida.
	 */
	public float convertirMoneda(int tipoConversion, float pesoMexicano) throws MonedaException {
		for(int i=0; i<this.valorMoneda.length; i++) {
			if(tipoConversion==i) {
				return pesoMexicano*valorMoneda[i];//Retorna el valor de la moneda convertida.
			}
		}
		throw new MonedaException("Opcion de conversion no valida.");
	}
}
