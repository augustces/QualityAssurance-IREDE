package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    Calculadora minhaCalculadora = new Calculadora();

    @Test
    public void calculoSoma(){
        assertEquals(4, minhaCalculadora.plus(2, 2));
    }

    @Test
    public void calculoMultiplicacao(){
        assertEquals(15, minhaCalculadora.times(3, 5));
    }
}
