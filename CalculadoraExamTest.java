/**
 * 
 */
package Examen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Examen.CalculadoraExam;

public class CalculadoraExamTest {

	@Test
	public void testdiv() { // pasa la prova com a true

		CalculadoraExam calculardivisio = new CalculadoraExam(25, 2);

		boolean resultat = calculardivisio.residu();

		assertEquals(false, resultat);
		

	}
	 @Test
	 public void testdiv1() { // pasa com la prova a false
	
			CalculadoraExam calculardivisio = new CalculadoraExam(0, 2);

			boolean resultat = calculardivisio.residu();

			assertEquals(true, resultat);
	
	 }
	 
	 @Test
	 public void Potencia() { // pasa com la prova a false
	
			CalculadoraExam calculardivisio = new CalculadoraExam(3, 2);

			int resultat = calculardivisio.potencia();

			assertEquals(9, resultat);
	
	 }

}
