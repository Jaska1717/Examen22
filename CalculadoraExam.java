/**
 * 
 */
package Examen;

public class CalculadoraExam {

	private int num1;
	private int num2;

	public CalculadoraExam(int a, int b) {

		num1 = a;
		num2 = b;
	}

	public int divideix() {
		int resultat = num1 / num2;

		return resultat;

	}

	public int potencia() {

		int potencia = 1;
		potencia = (int) Math.pow(num1, num2);
		return potencia;

	}

	public boolean residu() {

		if (num1 / 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

}
