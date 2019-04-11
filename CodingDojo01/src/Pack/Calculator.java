package Pack;

public class Calculator {
	public static int addString(String numberString) {

		if (numberString == "" || numberString == null) {
			return 0;
		}

		int suma = 0;
		int entero;
		String[] number = numberString.split(",");

		for (int i = 0; i < number.length; i++) {
			if (!number[i].equals("")) {
				try {
					Integer.parseInt(number[i]);
					entero = Integer.parseInt(number[i]);
					if (entero > 100) {
						entero = 0;
					}
				} catch (NumberFormatException excepcion) {
					entero = 0;
				}

				suma = suma + entero;
			}

		}
		return suma;
	}
}

/*
 * try { Integer.parseInt(cadena); resultado = true; } catch
 * (NumberFormatException excepcion) { resultado = false; }
 * 
 */
