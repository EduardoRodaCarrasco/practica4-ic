package com.calidad;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        
        assertEquals(10.0, calc.sumar(2, 3), 0.0001, "2 + 3 debe ser 5");
    }

    @Test
    public void testRestar() {
        assertEquals(1.0, calc.restar(3, 2), 0.0001, "3 - 2 debe ser 1");
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(4, 2), 0.0001, "4 / 2 debe ser 2");
    }

    @Test
    public void testDividirPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(10, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    public void testPotencia() {
        assertEquals(8.0, calc.potencia(2, 3), 0.0001, "2 elevado a 3 debe ser 8");
    }
    
    @Test
    public void testEsPar() {
       
        assertTrue(calc.esPar(5), "5 no debería ser considerado par");
    }
}