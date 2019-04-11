package Package;

import static org.junit.jupiter.api.Assertions.*;//se importan las librerías solas 
												//si se crea a partir de click derecho de la otra clase

import org.junit.jupiter.api.Test;


class CalculadoraTest2 {

	@Test
	public void sumar_twoPositiveNumbers1and50_correctResult() {
		int expected=51;
		int actual=Calculadora.sumar(1, 50);
		assertEquals(expected,actual);
	}
	
	@Test
	public void sumar_twoPositiveNumbers1and1_notZero() {
		int expected=0;
		int actual=Calculadora.sumar(1, 1);
		assertNotEquals(expected,actual);
	}
	
	
}
