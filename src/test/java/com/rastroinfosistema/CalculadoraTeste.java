package com.rastroinfosistema;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
@Test
public void testeSoma (){
	Calculadora calc=new Calculadora();
		int soma= calc.somar("1+2+2");
	assertEquals(5, soma);
		
	}

@Test
public void testeSomarComMock() {
	Calculadora calculadora=mock(Calculadora.class);
		/*enquanto(When)a soma for=2 entao returno(ThenReturn) = a 2 verdadeiro)*/
		when(calculadora.somar("1+1")).thenReturn(10);
		
		int resultado =calculadora.somar("1+1");
		assertEquals(10,resultado);
		
	}
	
}

	

