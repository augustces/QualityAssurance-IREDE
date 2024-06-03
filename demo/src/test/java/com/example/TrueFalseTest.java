package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TrueFalseTest {
    @Test
    public void verdadeiro(){
        boolean campoPresente = true;
        assertTrue(campoPresente);
    }
    @Test
    public void falso(){
        boolean campoPresente = false;
        assertFalse(campoPresente);
    }
}
