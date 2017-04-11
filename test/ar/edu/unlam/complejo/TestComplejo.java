package ar.edu.unlam.complejo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestComplejo {

	private Complejo complejo1;
	private Complejo complejo2;
	private Complejo resultado;

	@Before
	public void iniciar() {
		complejo1 = new Complejo(2, 1);
		complejo2 = new Complejo(3, 4);
	}

	@Ignore
	public void testSumarComplejos() {
		System.out.println("-Test suma de complejos:");
		System.out.println("Complejo1: " + complejo1);
		System.out.println("Complejo2: " + complejo2);
		complejo1.suma(complejo2);
		System.out.println("Resultado: " + complejo1);
		resultado = new Complejo(5, 5);
		assertTrue(complejo1.equals(resultado));
	}

	@Ignore
	public void testSumarReales() {
		System.out.println("-Test suma de reales:");
		System.out.println("Complejo: " + complejo1);
		Integer numero = 7;
		System.out.println("Real: " + numero);
		complejo1.suma(numero);
		System.out.println("Resultado: " + complejo1);
		resultado = new Complejo(9, 1);
		assertTrue(complejo1.equals(resultado));
	}

	@Ignore
	public void testRestarComplejo() {
		System.out.println("-Test resta de complejos:");
		System.out.println("Complejo1: " + complejo1);
		System.out.println("Complejo2: " + complejo2);
		complejo1.resta(complejo2);
		System.out.println("Resultado: " + complejo1);
		resultado = new Complejo(-1, -3);
		assertTrue(complejo1.equals(resultado));
	}

	@Ignore
	public void testRestarReal() {
		System.out.println("-Test resta de reales:");
		System.out.println("Complejo: " + complejo1);
		Integer numero = 7;
		System.out.println("Real: " + numero);
		complejo1.resta(numero);
		System.out.println("Resultado: " + complejo1);
		resultado = new Complejo(-5, 1);
		assertTrue(complejo1.equals(resultado));
	}

	@Test
	public void testMultiplicacionComplejos() {
		System.out.println("-Test multiplicación de complejos:");
		System.out.println("Complejo1: " + complejo1);
		System.out.println("Complejo2: " + complejo2);
		complejo1.multiplicacion(complejo2);
		System.out.println("Resultado: " + complejo1);
		resultado = new Complejo(2, 11);
		assertTrue(complejo1.equals(resultado));
	}

	@Test
	public void testMultiplicacionReal() {
		System.out.println("-Test multiplicación de reales:");
		System.out.println("Complejo: " + complejo1);
		Integer numero = 7;
		System.out.println("Real: " + numero);
		complejo1.multiplicacion(numero);
		System.out.println("Resultado: " + complejo1);
		resultado = new Complejo(14, 1);
		assertTrue(complejo1.equals(resultado));
	}

	@Test
	public void testModulo() {
		System.out.println("-Test modulo de complejo:");
		System.out.println("Complejo: " + complejo1);
		Double modulo = complejo1.modulo();
		System.out.println("Resultado: " + modulo);
		assertEquals(2.23606797749979, modulo.doubleValue(), 0);
	}

	@Ignore
	public void testClonarComplejo() {
		System.out.println("-Test clonar:");
		System.out.println("Complejo1: " + complejo1);
		System.out.println("Complejo2: " + complejo2);
		complejo2 = complejo1.clone();
		System.out.println("Resultado: " + complejo2);
		assertTrue(complejo1.equals(complejo2));
	}
}
