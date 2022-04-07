package com.alura;
import org.junit.Test;

public class CalculadoraTeste {
    
    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
    }
}
