import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
	@Test
	void test() {
		fail("Ainda não implementado");
		
	}
	
	@Test
	void testSomar() {
		Calculadora c = new Calculadora();
		double resultado = c.somar(10, 10);
		assertEquals(20, resultado);
	}
	
	@Test
	void testSomarPares() {
		Calculadora c = new Calculadora();
		double resultado = c.somar(10, 20);
		assertEquals(30, resultado);
	}
	
	@Test 
	void testVerificaInstancia() {
		Calculadora c = new Calculadora();
		c.valor = 5;
		c = null;
		assertNull(c);
	}
	
	@Test 
	void testComparaValores() {
		Calculadora c1 = new Calculadora();
		c1.valor = 1;
		
		Calculadora c2 = new Calculadora();
		c2.valor = 2; 
		assertTrue(c1.valor == c1.valor);
		}
	
	@Test
	void testSubtrair() {
		Calculadora c = new Calculadora();
		double resultado = c.subitrair(10, -15);
		assertEquals(25, resultado);
	}
	
	@Test
	void testMultiplicar() {
		Calculadora c = new Calculadora();
		double res = c.multiplicar(120.115, 12.5465);
		assertEquals(1507.01, 0.5, res);
		}

}
