package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EqualsValidationTest {
    @Test
    public void sucesso(){
        String resultado = "Registro salvo com sucesso!";
        assertEquals("Registro salvo com sucesso!", resultado);
    }
}
