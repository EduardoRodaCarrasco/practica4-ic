package com.calidad;

public class Calculadora {

    
    public float sumar(float a, float b) {
        return a + b;
    }

    
    public float restar(float a, float b) {
        return a - b;
    }

    
    public float dividir(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    
    public float potencia(float base, int exponente) {
        float resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

   
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}