package Package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void addString_twoNumber1and2_correctResult() {
		int expected = 3;
		int actual = Calculator.addString("1,2");
		assertEquals(expected, actual);
	}
	
	@Test
	void addString_twoNumbertwoDigits10and20_correctResult() {
		int expected = 30;
		int actual = Calculator.addString("10,20");
		assertEquals(expected, actual);
	}
	
	@Test
	void addString_oneNumber5_correctResult() {
		int expected = 5;
		int actual = Calculator.addString("5");
		assertEquals(expected, actual);
	}
	
	@Test
	void addString_nullString_correctResult() {
		int expected = 0;
		int actual = Calculator.addString(null);
		assertEquals(expected, actual);
	}
	
	@Test
	void addString_threeNumber5and3and4_correctResult() {
		int expected = 12;
		int actual = Calculator.addString("5,3,4");
		assertEquals(expected, actual);
	}
	
	@Test
	void addString_emptyString_correctResult() {
		int expected = 0;
		int actual = Calculator.addString("");
		assertEquals(expected, actual);
	}
	
	@Test
	void addString_twoCommasTwoNumbers5and3_correctResult() {
		int expected = 8;
		int actual = Calculator.addString("5,,3");
		assertEquals(expected, actual);
	}
	
	@Test
	void addString_numbersAndLetters_correctResult() {
		int expected = 8;
		int actual = Calculator.addString("5,a,3");
		assertEquals(expected, actual);
	}
	
	@Test
	void addString_twoNumbersGreaterThan100_correctResult() {
		int expected = 3;
		int actual = Calculator.addString("101,3");
		assertEquals(expected, actual);
	}
	
	@Test
	void addString_twoNumbers100nd3_correctResult() {
		int expected = 103;
		int actual = Calculator.addString("100,3");
		assertEquals(expected, actual);
	}
	
	@Test
	
	void addString_shouldNotBeConsideredNegativeNumbers_correctResult() {
		int expected = 3;
		int actual = Calculator.addString("-1,3");
		assertEquals(expected, actual);
	}

}
