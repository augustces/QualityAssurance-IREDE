package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PrePosTest {
    @BeforeAll
    public static void precondicao(){
        System.out.println("pre-condicao");
    }

    @AfterAll
    public static void poscondicao(){
        System.out.println("pos-condicao");
    }
    
    @Test
    public void metodo01(){
        System.out.println("metodo01");
    }

    @Test
    public void metodo02(){
        System.out.println("metodo02");
    }

    @Test
    public void metodo03(){
        System.out.println("metodo03");
    }

    @Test
    public void metodo04(){
        System.out.println("metodo04");
    }
}
