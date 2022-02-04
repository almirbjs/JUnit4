package com.rastroinfosistema;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
@Test
public void testeSoma (){
	Calculadora calc=new Calculadora();
		int soma= calc.somar("1+2+2");
	assertEquals(5, soma);
		
	
	}
	
}
